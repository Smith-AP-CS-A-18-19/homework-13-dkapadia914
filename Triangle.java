import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */
public class Triangle implements SmithShape {
/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
private double angle;
private int height;
private int width;
private int x;
private int y;

public Triangle(int x, int y, int width, int height, double angle) {
  this.angle = angle;
  this.height = height;
  this.width = width;
  this.x = x;
  this.y = y;
}

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */
 public double getAngle() {
   return angle;
 }

 public int getX() {
   return x;
 }

 public int getY() {
   return y;
 }

 public int getHeight() {
   return height;
 }

 public int getWidth() {
   return width;
 }


 public double getArea() {
   double area = 0.5 * width * height;
   return area;
 }

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

 public Rectangle2D toSquare() {
   double area = getArea();
   double side = Math.sqrt(area);
   Rectangle2D.Double rect = new Rectangle2D.Double(x, y, side, side);
   return rect;
 }

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
@Override
 public String toString() {
   String returnable = "Width:" + width + "\nHeight:" + height + "\nAngle:" + angle;
   return returnable;
 }
}
