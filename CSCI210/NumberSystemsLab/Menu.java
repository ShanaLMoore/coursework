//import libraries
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    // instance variables - replace the example below with your own
    private PrintWriter pw;
    /**
     * Constructor for objects of class Menu
     */
    public Menu(PrintWriter pw)
    {
        // initialise instance variables
        this.pw = pw;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void display()
    {
        // prompt the user to enter the number of players
        String line = "Welcome to the Number Systems Lab! Please enter a number to select a conversion type:\n\n" +
        "1: Converts a decimal integer into a 32-bit binary number\n" +
        "2: Converts a decimal integer into an 8-digit hexadecimal number\n" +
        "3: Converts a 32-bit binary number into a decimal integer\n" +
        "4: Converts a 32-bit binary number into an 8-digit hexadecimal number\n" +
        "5: Converts an 8-digit hexadecimal number into a decimal number\n" +
        "6: Converts an 8-digit hexadecimal number in a 32-bit binary number\n";
        
        System.out.println(line);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getSelection()
    {
        // read user input
        Scanner reader = new Scanner(System.in);
        
        return reader.nextInt();
    }

}
