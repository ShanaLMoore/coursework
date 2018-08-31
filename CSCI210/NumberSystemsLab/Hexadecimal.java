//import libraries
import java.util.Scanner;
import java.io.*;

/**
 * Converts an 8-digit hexadecimal number into a decimal integer,
 * or a 32-bit binary number
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hexadecimal
{
    // instance variables - replace the example below with your own
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
     * An example of a method - replace this comment with your own
     *
     */
    public void hexToDec()
    {
        // put your code here
        inputHex();
        toDec();
        outDec();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void hexToBin()
    {
        // put your code here
        inputHex();
        toBin();
        outBin();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    private void inputHex()
    {
        // put your code here
        System.out.println("Enter the 8-digit hexadecimal that " + 
        "you would like to convert:\n");
        
        // read user input
        Scanner reader = new Scanner(System.in);
        
        this.input = reader.nextLine().toUpperCase();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    private void toDec()
    {
        String digits = "0123456789ABCDEF";
        input = input.toUpperCase();
        decimal = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int d = digits.indexOf(c);
            decimal = 16*decimal + d;
        }  

    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    private void outDec()
    {
        // put your code here
        System.out.println("The Decimal represenation is: " + decimal + "\n");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    private void toBin()
    {
    String str = "";
    String binVal; // the binary value of the Hex
    binaryString = "";
    int val = 4;
    
    for (int i = 0; i < input.length(); i++) {
        char hexChar = input.charAt(i);

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
    
    binaryString = str.replaceAll("(.{" + val + "})", "$1 ").trim();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void outBin()
    {
        // put your code here
        System.out.println("The Binary represenation is: " + binaryString + "\n");
    }
}

