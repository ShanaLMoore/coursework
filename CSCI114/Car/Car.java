
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
        private double fuelLevel;

    /**
     * Constructor for objects of class Car
     */
    public Car(double gallon)
    {
        // initialise instance variables
        fuelLevel = gallon;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addGas(double gallon)
    {
        // put your code here
        fuelLevel += gallon;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double readFuel()
    {
        // put your code here
        return fuelLevel;
    }

}
