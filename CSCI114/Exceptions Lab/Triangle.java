
/**
 * Represents triangles.  A triangle is-a shape.
 *
 * @author Shana Moore
 * @version 5/14/2018
 */
public class Triangle extends Shape
{
    // instance variables
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(String color, boolean filled, double side1,double side2, double side3)
    {
        // initialize instance variables
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }

    /**
     * area() - calculates the area of a triangle. Overrides parent method. 
     *
     * @return    the calculated area of a triangle
     */
    public double area()
    {
        // (side2/2.0)*side1
        return side1 * (side2 / 2.0);
    }
    
    /**
     * perimeter() - calculates the perimeter of a triangle. Overrides parent method.
     *
     * @return    the sum of side1 + side2 + side3
     */
    public double perimeter()
    {
        // sum sides together
        return side1 + side2 + side3;
    }

    /**
     * toString() - returns nicely formatted string representation of a triangle object
     *
     * @return    string format of a triangle
     */
    public String toString()
    {
        // add custom message to parent's toString() method
        return super.toString() + "[side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }

}
