//import libraries
import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 * Write a description of class Menu here.
 *
 * @author  Shana Moore
 * @PID     011780377
 * @version 8/23/2018
 */
public class Menu
{
    // instance variables
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
     * Method that prompts the dislays a menu and prompts for user
     * input
     *
     */
    public void display()
    {
        // prompt the user to enter the number of players
        String line = "Welcome to the Number Systems Lab!\n Please "+
        " enter a number to select a conversion type:\n\n" +
        "1: Converts a decimal integer into a 32-bit binary number\n" +
        "2: Converts a decimal integer into an 8-digit hexadecimal number\n" +
        "3: Converts a 32-bit binary number into a decimal integer\n" +
        "4: Converts a 32-bit binary number into an 8-digit hexadecimal number\n" +
        "5: Converts an 8-digit hexadecimal number into a decimal number\n" +
        "6: Converts an 8-digit hexadecimal number in a 32-bit binary number\n"+
        "7: Exit Program";
        
        System.out.println(line);
        pw.println(line);
        
    }

    /**
     * Method that calls Scanner() to retrieve user input
     *
     * @return    the user's input
     */
    public int getSelection()
    {
        // read user input
        Scanner reader = new Scanner(System.in);
        int input = 0; 
        
        try 
        {
            input = reader.nextInt();           
        }
        catch(InputMismatchException exception)
        {
            // print error messages if input is not an integer
            System.out.println("Invalid input. Please select a number.");
            pw.println("Invalid input. Please select a number.");
        }
        
        return input;
    }

}
