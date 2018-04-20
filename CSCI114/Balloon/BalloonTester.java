
/**
 * Tests Balloon class.
 *
 * @author Shana Moore
 * @version 02/28/2018
 */

// import Scanner library to read keyboard input
import java.util.Scanner;

public class BalloonTester
{    
    /**
     * main() method
     */
    public static void main(String[] args)
    {
         // clear the Terminal Window
        System.out.print("\f");       
        
        // Create a new Scanner object
        Scanner in = new Scanner(System.in);
        
        // Scannar reads a color from the keyboard
        System.out.print("Enter color: ");
        String color = in.next();
        
        // Scanner reads a size from the keyboard
        System.out.print("Enter size: ");
        double size = in.nextDouble();
        
        // Create new balloon
        Balloon balloon1 = new Balloon(color, size);
        
        // Inflate this balloon by 5.0 units
        balloon1.inflate(5.0);
        
        // Output the color of the balloon
        String balloon_color = balloon1.getColor();
        System.out.printf("For the %s balloon \n", color);
        
        // Output the volume of the balloon with 2 decimal places
        double balloon_volume = balloon1.volume();
        System.out.printf("Volume is now: %.2f", balloon_volume);
    }
}
