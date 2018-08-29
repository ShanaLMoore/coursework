
/**
 * Implement a Circle, Triangle, and Rectangle class
 * which extend the class Shape.
 * 
 * All shapes must have a color and are either filled or not. 
 * All shapes must calculate and return their perimeter and area.
 *
 * ABSTRACT CLASS RULES: 
 * - instance variables and methods, like a normal superclass
 * - 'abstract methods' = no implementation allowed, have to be implemented in all subclasses.
 * 
 * @author Shana Moore
 * @version 5/14/2018
 */
public abstract class Shape
{
    // instance variables
    private String color;
    private boolean filled;
    
    // declare abstract methods that subclasses MUST implement
    public abstract double area();
    public abstract double perimeter();

    /**
     * Constructor for objects of class Shape
     */
    public Shape(String color, boolean filled)
    {
        // initialize instance variables
        this.color = color;
        this.filled = filled;
    }

    /**
     * toString() - returns nicely formatted string representation of an object
     *
     * @return    string format of an object
     */
    public String toString()
    {
        // return string that will be approriate + inherited amongst children classes
        return getClass().getName() + "[color=" + color + ",filled=" + filled + "]";
    }

}
