/*
 * Copyright (c) 2011, The University of Sheffield.
 * 
 * This file is part of GATE (see http://gate.ac.uk/), and is free software,
 * Licensed under the GNU Library General Public License, Version 3, June 2007
 * (in the distribution as file licence.html, and also available at
 * http://gate.ac.uk/gate/licence.html).
 */

package gate.creole.measurements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import gate.Annotation;
import gate.Document;
import gate.Factory;
import gate.Gate;
import gate.LanguageAnalyser;
import gate.creole.Plugin;
import gate.creole.annic.apache.lucene.analysis.Tokenizer;
import gate.util.GateException;
import junit.framework.TestCase;

/**
 * @author Mark A. Greenwood
 */
public class MeasurementsTest extends TestCase {

  private static MeasurementsParser parser;
  
  @Override
  public void setUp() throws MalformedURLException, IOException, GateException  {
    URL units = getClass().getClassLoader().getResource("resources/units.dat");
    URL commonWords = getClass().getClassLoader().getResource("resources/common_words.txt");
    
    parser = new MeasurementsParser(units, commonWords);
    
    Gate.init();
    Gate.getCreoleRegister().registerPlugin(new Plugin.Maven("uk.ac.gate.plugins", "annie", "8.5-SNAPSHOT"));
  }

  @Override
  public void tearDown() {
    parser = null;
  }

  public void test6Feet() {
    Measurement m = parser.parse(6d, "Mark was 6 feet 6 inches tall.", 11);
    assertNotNull(m);
        
    assertEquals("length", m.getDimension());
    
    assertEquals(6d, m.getValue());
    assertEquals("feet", m.getUnit());
    assertEquals("feet", m.getParsedText());
    
    assertEquals(1.8288, m.getNormalizedValue());
    assertEquals("m", m.getNormalizedUnit());
  }
  
  public void test6Inches() {
    Measurement m = parser.parse(6d, "Mark was 6 feet 6 inches tall.", 18);
    assertNotNull(m);
    
    assertEquals("length", m.getDimension());
    
    assertEquals(6d, m.getValue());
    assertEquals("inches", m.getUnit());
    assertEquals("inches", m.getParsedText());
    
    assertEquals(0.1524, m.getNormalizedValue());
    assertEquals("m", m.getNormalizedUnit());
  }
  
  public void testLasix() {
    Measurement m = parser.parse(20d, "Lasix 20 mg p.o.", 9);
    assertNotNull(m);
    
    assertEquals("mass", m.getDimension());
    
    assertEquals(20d, m.getValue());
    assertEquals("mg", m.getUnit());
    assertEquals("mg", m.getParsedText());
        
    assertEquals(2.0E-5, m.getNormalizedValue());
    assertEquals("kg", m.getNormalizedUnit());    
  }
  
  public void testGATENoDimension() throws Exception {
    Document doc = null;
    LanguageAnalyser tokenizer = null;
    try {
      doc = Factory.newDocument("20 g2/m has no dimension");
      
      tokenizer = (LanguageAnalyser)Factory.createResource("gate.creole.tokeniser.DefaultTokeniser");
      
      tokenizer.setDocument(doc);
      tokenizer.execute();
      
      List<Annotation> tokens = gate.Utils.inDocumentOrder(doc.getAnnotations().get("Token"));
      
      assertEquals(8, tokens.size());
      
      List<Annotation> unitTokens = tokens.subList(1, tokens.size());
      
      assertEquals(7, unitTokens.size());
      
      Measurement m = parser.parse(20d, doc, unitTokens, "", true);
      
      assertNull(m);
      
      m = parser.parse(20d, doc, unitTokens, "", false);
      
      assertEquals(20d, m.getValue());
      assertEquals("g2/m", m.getUnit());
      assertEquals("g2/m", m.getParsedText());
      assertEquals(0.00002d, m.getNormalizedValue());
      assertEquals("kg^2 / m", m.getNormalizedUnit());
      
      assertNull(m.getDimension());
    }
    finally {
      if (doc != null) Factory.deleteResource(doc);
      if (tokenizer != null) Factory.deleteResource(tokenizer);
    }
  }
  
  public void testGATEDimension() throws Exception {
    Document doc = null;
    LanguageAnalyser tokenizer = null;
    try {
      doc = Factory.newDocument("20 m2/g d w 40");
      
      tokenizer = (LanguageAnalyser)Factory.createResource("gate.creole.tokeniser.DefaultTokeniser");
      
      tokenizer.setDocument(doc);
      tokenizer.execute();
      
      List<Annotation> tokens = gate.Utils.inDocumentOrder(doc.getAnnotations().get("Token"));
      
      assertEquals(8, tokens.size());
      
      List<Annotation> unitTokens = tokens.subList(1, tokens.size());
      
      assertEquals(7, unitTokens.size());
      
      Measurement m = parser.parse(20d, doc, unitTokens, "", true);
      
      assertNotNull(m);
      
      assertEquals(20d, m.getValue());
      assertEquals("m2/g", m.getUnit());
      assertEquals("m2/g", m.getParsedText());
      assertEquals(20000d, m.getNormalizedValue());
      assertEquals("m^2 / kg", m.getNormalizedUnit());
      
      assertNotNull(m.getDimension());
      assertEquals("specific_surface_area", m.getDimension());
    }
    finally {
      if (doc != null) Factory.deleteResource(doc);
      if (tokenizer != null) Factory.deleteResource(tokenizer);
    }
  }
}
