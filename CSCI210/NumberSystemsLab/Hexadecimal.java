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
        
        this.input = reader.nextLine();
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
        String hexdecnum;
        int decnum, i=1, j;
        int binnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdecnum = scan.nextLine();
        
        /* first convert the hexadecimal to decimal */
        
        /**decnum = hex2decimal(hexdecnum);
        
        /* now convert the decimal to binary */
        
        /**while(decnum != 0)
        {
            binnum[i++] = decnum%2;
            decnum = decnum/2;
        }
		
        System.out.print("Equivalent Binary Number is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binnum[j]);
        }*/
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

