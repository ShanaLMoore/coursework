//import libraries
import java.util.Scanner;
import java.io.*;

/**
 * Converts a 32-bit binary number into a decimal integer, 
 * or an 8-digit hexadecimal number
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Binary
{
    // instance variables - replace the example below with your own
    private PrintWriter pw;
    private String input;
    private int decimal=0;
    /**
     * Constructor for objects of class Binary
     */
    public Binary(PrintWriter pw)
    {
        // initialise instance variables
        this.pw = pw;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public void binToDec()
    {
        // put your code here
        inputBin();
        toDec();
        outDec();
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public void binToHex()
    {
        // put your code here
        inputBin();
        toHex();
        outHex();
    }   
    
    /**
     * An example of a method - replace this comment with your own
     */
    private void inputBin()
    {
        // put your code here
        System.out.println("Enter the 8-digit binary that " + 
        "you would like to convert:\n");
        
        // read user input
        Scanner reader = new Scanner(System.in);
        
        this.input = reader.nextLine();

    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void toDec()
    {
        // put your code here
        int p=0; 
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    private void outDec()
    {
        // put your code here
        System.out.println("The Decimal Integer representation is: " + decNum + "\n");
    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void toHex()
    {
        // put your code here

    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void outHex()
    {
        // put your code here

    }
}
