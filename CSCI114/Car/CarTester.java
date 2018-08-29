
/**
 * Write a description of class CarTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarTester
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class CarTester
     */
    public static void main (String args[])
    {
        // initialise instance variables
        Car car1 = new Car(20);
        
        System.out.println("Car1:" + car1.readFuel());
        
        Car car2 = car1;
        System.out.println("Car2:" + car2.readFuel());
                
        car2.addGas(10);
        System.out.println("car1:" + car1.readFuel());
        System.out.println("car2: " + car2.readFuel());        
    }

}
