
/**
 * Creates a new balloon object.
 *
 * @author Shana Moore
 * @version 02/28/2018
 */
public class Balloon
{
    //constants
    public static final double PI = 3.1415926;
    
    // instance variables
    private String color;
    private double size;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon(String color, double size)
    {
        // initialize instance variables
        this.color = color;
        this.size = size;
    }

    /**
     * inflate() - method to increase the size of the balloon
     *
     * @param  amount  add this amount to the size of the balloon
     */
    public void inflate(double amount)
    {
        //add amount to size
        size += amount;
    }

    /**
     * volume() - method that calculates and returns the current volume of the balloon
     *
     * @return    volume
     */
    public double volume()
    {
        // volume formula = 4/3*PI*(size*size*size)
        double balloon_volume = (4.0/3.0)*PI*size*size*size;
        return balloon_volume;
    }

    /**
     * getColor() - method that returns the color of a balloon
     *
     * @return    color
     */
    public String getColor()
    {
        return color;
    }

}
