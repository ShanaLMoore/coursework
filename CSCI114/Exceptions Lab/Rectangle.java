
/**
 * Represents rectangles.  A rectangle is-a shape.
 *
 * @author Shana Moore
 * @version 5/14/2018
 */
public class Rectangle extends Shape
{
    // instance variables 
    private double length;
    private double width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(String color, boolean filled, double length,
    double width)
    {
        // initialize instance variables
        super(color, filled);
        this.length = length;
        this.width = width;
        
    }

    /**
     * area() - calculates the area of a rectangle. Overrides parent method. 
     *
     * @return    the product of length and width
     */
    public double area()
    {
        // A = l * w
        return length * width;
    }

    /**
     * perimeter() - calculates the perimeter of a rectangle. Overrides parent method.
     *
     * @return    the calulated perimeter of a rectangle
     */
    public double perimeter()
    {
        // P = 2(l + w)
        return 2 * (length + width);
    }
    
    /**
     * toString() - returns nicely formatted string representation of a rectangle object
     *
     * @return    string format of a rectangle
     */
    public String toString()
    {
        // add custom message to parent's toString() method
        return super.toString() + "[length=" + length + ", width=" + width + "]";
    }

}
