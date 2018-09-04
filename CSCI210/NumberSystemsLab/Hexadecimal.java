//import libraries
import java.util.Scanner;
import java.io.*;

/**
 * Converts an 8-digit hexadecimal number into a decimal integer,
 * or a 32-bit binary number
 *
 * @author  Shana Moore
 * @PID     011780377
 * @version 8/23/2018
 */
public class Hexadecimal
{
    // instance variables
    private PrintWriter pw;
    private String input, binaryString;
    public int decimal;

    /**
     * Constructor for objects of class Hexadecimal
     */
    public Hexadecimal(PrintWriter pw)
    {
        // initialise instance variables
        this.pw = pw;
    }

    /**
     * Method containing method calls for user input, conversion
     * and output of a hexadecimal integers to decimal representation
     *
     */
    public void hexToDec()
    {
        inputHex();
        toDec();
        outDec();
    }
    
    /**
     * Method containing method calls for user input, conversion
     * and output of a hexadecimal integers to binary representation
     *
     */
    public void hexToBin()
    {
        inputHex();
        toBin();
        outBin();
    }

    /**
     * Retrieves user input
     *
     */
    private void inputHex()
    {
        // output to file
        System.out.println("Enter the 8-digit hexadecimal that " + 
        "you would like to convert:\n");
        
        // output to csis.txt file
        pw.println("Enter the 8-digit hexadecimal that " + 
        "you would like to convert:\n");        
        
        // read user input
        Scanner reader = new Scanner(System.in);
        
        // normalize user input
        this.input = reader.nextLine().toUpperCase();
        pw.println("User Input: " + input);
    }

    /**
     * Converts hexadecimal to decimal integer
     *
     */
    private void toDec()
    {
        String digits = "0123456789ABCDEF";
        // normalize user input
        input = input.toUpperCase();
        decimal = 0;
        
        // loop through user input 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); 
            // map index to character
            int d = digits.indexOf(c);
            // hexadecimal is a base 16 number system
            decimal = 16*decimal + d;
        }  

    }

    /**
     * Outputs string to console and file to display decimal conversion
     *
     */
    private void outDec()
    {
       // output to console
       System.out.println("The Decimal represenation is: "
       + decimal + "\n");
        
       // output to csis.txt file 
       pw.println("The Decimal represenation is: "
       + decimal + "\n");        
    }

    /**
     * Converts hexadecimal to binary number
     *
     */
    private void toBin()
    {
    String binVal; // the binary value of the Hex
    String str = "";
    binaryString = "";

    
    for (int i = 0; i < input.length(); i++) {
        char hexChar = input.charAt(i);
        
        // switch statement for hexadecimal to binary conversion
        switch (hexChar) {
            case ('0'):
                binVal = "0000";
                break;
            case ('1'):
                binVal = "0001";
                break;
            case ('2'):
                binVal = "0010";
                break;
            case ('3'):
                binVal = "0011";
                break;
            case ('4'):
                binVal = "0100";
                break;
            case ('5'):
                binVal = "0101";
                break;
            case ('6'):
                binVal = "0110";
                break;
            case ('7'):
                binVal = "0111";
                break;
            case ('8'):
                binVal = "1000";
                break;
            case ('9'):
                binVal = "1001";
                break;
            case ('A'):
                binVal = "1010";
                break;
            case ('B'):
                binVal = "1011";
                break;
            case ('C'):
                binVal = "1100";
                break;
            case ('D'):
                binVal = "1101";
                break;
            case ('E'):
                binVal = "1110";
                break;
            case ('F'):
                binVal = "1111";
                break;
            default:
                binVal = "invalid input";
                break;
        }
         str += binVal;
    }
    // include space separating nibbles
    int val = 4;    
    binaryString = str.replaceAll("(.{" + val + "})", "$1 ").trim();
    }

    /**
     * Outputs string to console and file to display binary conversion
     *
     */
    public void outBin()
    {
        // output to console
        System.out.println("The Binary represenation is: "
        + binaryString + "\n");
        
        // output to csis.txt file       
        pw.println("The Binary represenation is: "
        + binaryString + "\n");
    }
}

