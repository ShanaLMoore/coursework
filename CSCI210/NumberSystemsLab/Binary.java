//import libraries
import java.util.Scanner;
import java.io.*;

/**
 * Converts a 32-bit binary number into a decimal integer, 
 * or an 8-digit hexadecimal number
 *
 * @author  Shana Moore
 * @PID     011780377
 * @version 8/23/2018
 */
public class Binary
{
    // instance variables
    private PrintWriter pw;
    private String hexaDeciString, input;
    private int decimal;
    /**
     * Constructor for objects of class Binary
     */
    public Binary(PrintWriter pw)
    {
        // initialise instance variables
        this.pw = pw;
        decimal = 0;
        hexaDeciString = "";
        input = "";
    }
    
    /**
     * Method containing method calls for user input, conversion
     * and output of a binary number to decimal representation
     */
    public void binToDec()
    {
        inputBin();
        toDec();
        outDec();
    }
    
    /**
     * Method containing method calls for user input, conversion
     * and output of a binary number to hexadecimal representation
     */
    public void binToHex()
    {
        inputBin();
        toHex();
        outHex();
    }   
    
    /**
     * Retrieves user input
     */
    private void inputBin()
    {
        // output to console
        System.out.println("Enter the 8-digit binary that " + 
        "you would like to convert:\n");
        
        // output to csis.txt file
        pw.println("Enter the 8-digit binary that " + 
        "you would like to convert:\n");        
        
        // read user input
        Scanner reader = new Scanner(System.in);
        
        this.input = reader.nextLine();
        this.input = input.replaceAll("\\s",""); // remove white spaces 
        
        pw.println("User Input: " + input);
    }

    /**
     * Converts binary number to decimal
     */
    private void toDec()
    {
        int length = input.length() - 1;
        decimal = 0;
        char[] digits = input.toCharArray();
        
        // loop through user input
        for (char digit : digits) {
            // if binary value is present, calculate power of 2
            if (String.valueOf(digit).equals("1")) {
                decimal += Math.pow(2, length);
            }
            --length;
         }    

    }

    /**
     * Outputs string to console and file to display decimal
     * conversion
     */
    
    private void outDec()
    {
        // output to console
        System.out.printf("The Decimal representation is: "
        + decimal + "\n");
        
        // output to csis.txt file
        pw.printf("The Decimal representation is: "
        + decimal + "\n");        
    }

    /**
     * Converts binary number to hexadecimal 
     */
    private void toHex()
    {
        hexaDeciString = "";
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
                
        if (input != null && !input.isEmpty()) {
            toDec(); // convert to decimal
            while (decimal > 0) {
                hexaDeciString = hex[decimal % 16] + hexaDeciString;
                decimal /= 16;
            } 
        }
        
        /*
         * Hint from Stegman text - confused!! TODO: REVISIT THIS
         * 
         * StringBuilder hex = new StringBuilder("00000000");
        
        for(int i = 0, j = 0; i < input.length(); i += 4, j++){
            if(input.substring(i, i+4).equals("0000")){
                hex.setCharAt(j, '0');
            } else if(input.substring(i, i+4).equals("0001")){
                hex.setCharAt(j, '1');
            }

        }
        System.out.println(hex); */
    }

    /**
     * Outputs string to console and file to display hexadecimal
     * conversion
     */
    private void outHex()
    {
        // output to console
        System.out.println("The Hexadecimal representation is: "
        + hexaDeciString + "\n");
        
        // output to csis.txt file
        pw.println("The Hexadecimal representation is: "
        + hexaDeciString + "\n");        
    }
}
