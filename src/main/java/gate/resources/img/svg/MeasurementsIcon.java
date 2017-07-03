package gate.resources.img.svg;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class has been automatically generated using <a
 * href="http://englishjavadrinker.blogspot.com/search/label/SVGRoundTrip">SVGRoundTrip</a>.
 */
@SuppressWarnings("unused")
public class MeasurementsIcon implements
		javax.swing.Icon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Area clip = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    Shape clip_ = g.getClip();
AffineTransform defaultTransform_ = g.getTransform();
//  is CompositeGraphicsNode
float alpha__0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0 = g.getClip();
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
clip = new Area(g.getClip());
clip.intersect(new Area(new Rectangle2D.Double(0.0,0.0,48.0,48.0)));
g.setClip(clip);
// _0 is CompositeGraphicsNode
float alpha__0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0 = g.getClip();
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0 is CompositeGraphicsNode
origAlpha = alpha__0_0;
g.setTransform(defaultTransform__0_0);
g.setClip(clip__0_0);
float alpha__0_1 = origAlpha;
origAlpha = origAlpha * 0.5800866f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_1 = g.getClip();
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0504201650619507f, 0.0f, 0.0f, 2.7647058963775635f, -1.4070385694503784f, -83.1943359375f));
// _0_1 is ShapeNode
paint = new Color(39, 39, 39, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(46.5, 43.8125);
((GeneralPath)shape).curveTo(46.5, 44.399303, 36.510353, 44.875, 24.1875, 44.875);
((GeneralPath)shape).curveTo(11.864647, 44.875, 1.875, 44.399303, 1.875, 43.8125);
((GeneralPath)shape).curveTo(1.875, 43.225697, 11.864647, 42.75, 24.1875, 42.75);
((GeneralPath)shape).curveTo(36.510353, 42.75, 46.5, 43.225697, 46.5, 43.8125);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_1;
g.setTransform(defaultTransform__0_1);
g.setClip(clip__0_1);
float alpha__0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_2 = g.getClip();
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(0.9444435238838196f, 0.0f, 0.0f, 1.0104289054870605f, 1.2058520317077637f, -3.4433577060699463f));
// _0_2 is ShapeNode
paint = new Color(215, 192, 0, 255);
shape = new Rectangle2D.Double(1.3054279088974, 10.958484649658203, 45.526798248291016, 30.677555084228516);
g.setPaint(paint);
g.fill(shape);
paint = new Color(102, 84, 0, 255);
stroke = new BasicStroke(1.0262388f,0,0,2.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3054279088974, 10.958484649658203, 45.526798248291016, 30.677555084228516);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_2;
g.setTransform(defaultTransform__0_2);
g.setClip(clip__0_2);
float alpha__0_3 = origAlpha;
origAlpha = origAlpha * 0.26839826f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_3 = g.getClip();
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(0.8798574209213257f, 0.0f, 0.0f, -0.6030572056770325f, 2.7603633403778076f, 34.219459533691406f));
// _0_3 is ShapeNode
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(1.3054279, 21.322344);
((GeneralPath)shape).curveTo(16.123234, 16.102161, 31.257196, 15.494681, 46.832226, 21.322344);
((GeneralPath)shape).lineTo(46.832226, 41.63604);
((GeneralPath)shape).lineTo(1.3054279, 41.63604);
((GeneralPath)shape).lineTo(1.3054279, 21.322344);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_3;
g.setTransform(defaultTransform__0_3);
g.setClip(clip__0_3);
float alpha__0_4 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_4 = g.getClip();
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.7660323977470398f, 14.963319778442383f, 5.013245105743408f));
// _0_4 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_4;
g.setTransform(defaultTransform__0_4);
g.setClip(clip__0_4);
float alpha__0_5 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_5 = g.getClip();
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.45961931347846985f, 16.963319778442383f, 7.0710673332214355f));
// _0_5 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_5;
g.setTransform(defaultTransform__0_5);
g.setClip(clip__0_5);
float alpha__0_6 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_6 = g.getClip();
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 18.96332550048828f, 7.07106351852417f));
// _0_6 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_6;
g.setTransform(defaultTransform__0_6);
g.setClip(clip__0_6);
float alpha__0_7 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_7 = g.getClip();
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 20.96332550048828f, 7.07106351852417f));
// _0_7 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_7;
g.setTransform(defaultTransform__0_7);
g.setClip(clip__0_7);
float alpha__0_8 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_8 = g.getClip();
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 22.96332550048828f, 7.07106351852417f));
// _0_8 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_8;
g.setTransform(defaultTransform__0_8);
g.setClip(clip__0_8);
float alpha__0_9 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_9 = g.getClip();
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.612825870513916f, 24.96332550048828f, 6.042152404785156f));
// _0_9 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_9;
g.setTransform(defaultTransform__0_9);
g.setClip(clip__0_9);
float alpha__0_10 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_10 = g.getClip();
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 26.96332550048828f, 7.07106351852417f));
// _0_10 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_10;
g.setTransform(defaultTransform__0_10);
g.setClip(clip__0_10);
float alpha__0_11 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_11 = g.getClip();
AffineTransform defaultTransform__0_11 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 28.963321685791016f, 7.07106351852417f));
// _0_11 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_11;
g.setTransform(defaultTransform__0_11);
g.setClip(clip__0_11);
float alpha__0_12 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_12 = g.getClip();
AffineTransform defaultTransform__0_12 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 30.963319778442383f, 7.07106351852417f));
// _0_12 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_12;
g.setTransform(defaultTransform__0_12);
g.setClip(clip__0_12);
float alpha__0_13 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_13 = g.getClip();
AffineTransform defaultTransform__0_13 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 32.963321685791016f, 7.07106351852417f));
// _0_13 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_13;
g.setTransform(defaultTransform__0_13);
g.setClip(clip__0_13);
float alpha__0_14 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_14 = g.getClip();
AffineTransform defaultTransform__0_14 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.7660323977470398f, 34.95884323120117f, 5.013241291046143f));
// _0_14 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_14;
g.setTransform(defaultTransform__0_14);
g.setClip(clip__0_14);
float alpha__0_15 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_15 = g.getClip();
AffineTransform defaultTransform__0_15 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.45961931347846985f, 36.963321685791016f, 7.0710673332214355f));
// _0_15 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_15;
g.setTransform(defaultTransform__0_15);
g.setClip(clip__0_15);
float alpha__0_16 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_16 = g.getClip();
AffineTransform defaultTransform__0_16 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 38.963321685791016f, 7.07106351852417f));
// _0_16 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_16;
g.setTransform(defaultTransform__0_16);
g.setClip(clip__0_16);
float alpha__0_17 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_17 = g.getClip();
AffineTransform defaultTransform__0_17 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 40.963321685791016f, 7.07106351852417f));
// _0_17 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_17;
g.setTransform(defaultTransform__0_17);
g.setClip(clip__0_17);
float alpha__0_18 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_18 = g.getClip();
AffineTransform defaultTransform__0_18 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 42.963321685791016f, 7.07106351852417f));
// _0_18 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_18;
g.setTransform(defaultTransform__0_18);
g.setClip(clip__0_18);
float alpha__0_19 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_19 = g.getClip();
AffineTransform defaultTransform__0_19 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.612825870513916f, 44.963321685791016f, 6.042152404785156f));
// _0_19 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_19;
g.setTransform(defaultTransform__0_19);
g.setClip(clip__0_19);
float alpha__0_20 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_20 = g.getClip();
AffineTransform defaultTransform__0_20 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 46.963321685791016f, 7.07106351852417f));
// _0_20 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_20;
g.setTransform(defaultTransform__0_20);
g.setClip(clip__0_20);
float alpha__0_21 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_21 = g.getClip();
AffineTransform defaultTransform__0_21 = g.getTransform();
g.transform(new AffineTransform(0.612825870513916f, 0.0f, 0.0f, 0.459619402885437f, 48.963321685791016f, 7.07106351852417f));
// _0_21 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(-11.74885082244873, 6.71584415435791, 1.6317847967147827, 13.054278373718262);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_21;
g.setTransform(defaultTransform__0_21);
g.setClip(clip__0_21);
float alpha__0_22 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_22 = g.getClip();
AffineTransform defaultTransform__0_22 = g.getTransform();
g.transform(new AffineTransform(0.9017035961151123f, 0.0f, 0.0f, -0.9470010995864868f, 2.234551191329956f, 48.03169250488281f));
// _0_22 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(23.76474380493164, 11.410764694213867), new Point2D.Double(23.76474380493164, 64.24067687988281), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0821635f,0,0,2.0f,null,0.0f);
shape = new Rectangle2D.Double(1.3054279088974, 10.958484649658203, 45.526798248291016, 30.677555084228516);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_22;
g.setTransform(defaultTransform__0_22);
g.setClip(clip__0_22);
float alpha__0_23 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_23 = g.getClip();
AffineTransform defaultTransform__0_23 = g.getTransform();
g.transform(new AffineTransform(-2.828427314758301f, 0.0f, 0.0f, 1.6396678686141968f, 45.50884246826172f, -18.43528938293457f));
// _0_23 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new Rectangle2D.Double(5.9220194816589355, 24.267728805541992, 0.3535533845424652, 3.0493979454040527);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_23;
g.setTransform(defaultTransform__0_23);
g.setClip(clip__0_23);
float alpha__0_24 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_24 = g.getClip();
AffineTransform defaultTransform__0_24 = g.getTransform();
g.transform(new AffineTransform(0.75f, 0.0f, 0.0f, 1.0f, 2.075819969177246f, 0.0f));
// _0_24 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.25, 21.34375);
((GeneralPath)shape).lineTo(6.25, 26.34375);
((GeneralPath)shape).lineTo(10.25, 26.34375);
((GeneralPath)shape).lineTo(10.25, 21.34375);
((GeneralPath)shape).lineTo(6.25, 21.34375);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.5740905, 22.34375);
((GeneralPath)shape).lineTo(9.25, 22.34375);
((GeneralPath)shape).lineTo(9.25, 25.34375);
((GeneralPath)shape).lineTo(7.5740905, 25.34375);
((GeneralPath)shape).lineTo(7.5740905, 22.34375);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_24;
g.setTransform(defaultTransform__0_24);
g.setClip(clip__0_24);
float alpha__0_25 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_25 = g.getClip();
AffineTransform defaultTransform__0_25 = g.getTransform();
g.transform(new AffineTransform(-0.75f, 0.0f, 0.0f, 1.0f, 14.450819969177246f, 0.0f));
// _0_25 is ShapeNode
paint = new Color(102, 84, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.25, 21.34375);
((GeneralPath)shape).lineTo(6.25, 26.34375);
((GeneralPath)shape).lineTo(10.25, 26.34375);
((GeneralPath)shape).lineTo(10.25, 21.34375);
((GeneralPath)shape).lineTo(6.25, 21.34375);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.5740905, 22.34375);
((GeneralPath)shape).lineTo(9.25, 22.34375);
((GeneralPath)shape).lineTo(9.25, 25.34375);
((GeneralPath)shape).lineTo(7.5740905, 25.34375);
((GeneralPath)shape).lineTo(7.5740905, 22.34375);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_25;
g.setTransform(defaultTransform__0_25);
g.setClip(clip__0_25);
origAlpha = alpha__0;
g.setTransform(defaultTransform__0);
g.setClip(clip__0);
g.setTransform(defaultTransform_);
g.setClip(clip_);

	}
	
	public Image getImage() {
		BufferedImage image =
            new BufferedImage(getIconWidth(), getIconHeight(),
                    BufferedImage.TYPE_INT_ARGB);
    	Graphics2D g = image.createGraphics();
    	paintIcon(null, g, 0, 0);
    	g.dispose();
    	return image;
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 8;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 48;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 48;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public MeasurementsIcon() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}
	
	/**
	 * Creates a new transcoded SVG image with the given dimensions.
	 *
	 * @param size the dimensions of the icon
	 */
	public MeasurementsIcon(Dimension size) {
	this.width = size.width;
	this.height = size.width;
	}

	public MeasurementsIcon(int width, int height) {
	this.width = width;
	this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);
						
		Area clip = new Area(new Rectangle(0, 0, this.width, this.height));		
		if (g2d.getClip() != null) clip.intersect(new Area(g2d.getClip()));		
		g2d.setClip(clip);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

