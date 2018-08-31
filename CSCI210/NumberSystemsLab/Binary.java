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
        this.input = input.replaceAll("\\s",""); // remove white spaces 

    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void toDec()
    {
        int length = input.length() - 1;
        decimal = 0;
        char[] digits = input.toCharArray();
        for (char digit : digits) {
            if (String.valueOf(digit).equals("1")) {
                decimal += Math.pow(2, length);
            }
            --length;
         }    

    }

    /**
     * An example of a method - replace this comment with your own
     */
    
    private void outDec()
    {
        // put your code here
        System.out.printf("The Decimal representation is: " + decimal + "\n");
    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void toHex()
    {
        hexaDeciString = "";
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
        if (input != null && !input.isEmpty()) {
            toDec();
            while (decimal > 0) {
                hexaDeciString = hex[decimal % 16] + hexaDeciString;
                decimal /= 16;
            } 
        }
        
        /*StringBuilder hex = new StringBuilder("00000000");
        
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
     * An example of a method - replace this comment with your own
     */
    private void outHex()
    {
        // put your code here
        System.out.println("The Hexadecimal representation is: " + hexaDeciString + "\n");
    }
}
