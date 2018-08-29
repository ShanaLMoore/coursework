
/**
 * Represents circles.  A circle is-a shape.
 *
 * @author Shana Moore
 * @version 5/14/2018
 */
public class Circle extends Shape
{
    // instance variables
    private double radius;
    final double pi = Math.PI;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(String color, boolean filled, double radius)
    {
        // initialize instance variables
        super(color, filled);
        this.radius = radius;
        
    }

    /**
     * area() - calculates the area of a circle. Overrides parent method. 
     *
     * @return    the calculated area of a circle
     */
    public double area()
    {
        // calculate area 
        return Math.PI * Math.pow(radius, 2.0);
    }
    
    /**
     * perimeter() - calculates the perimeter of a circle. Overrides parent method.
     *
     * @return    the calulated perimeter of a circle
     */
    public double perimeter()
    {
        // calculate perimeter
        return 2.0 * Math.PI * radius;
    }

    /**
     * toString() - returns nicely formatted string representation of a circle object
     *
     * @return    string format of a circle
     */
    public String toString()
    {
        // add custom message to parent's toString() method
        return super.toString() + "[radius=" + radius + "]";
    }

}
