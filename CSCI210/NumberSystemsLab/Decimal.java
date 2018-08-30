//import libraries
import java.util.Scanner;
import java.io.*;

/**
 * Converts a decimal integer into a 32-bit binary number,
 * or an 8-bit hexadecimal number
 *
 * @author  Shana Moore
 * @PID     011780377
 * @version 8/23/2018
 */

public class Decimal
{
    // instance variables - replace the example below with your own
    private PrintWriter pw;
    private int input, num;
    private String binaryString, hexaDeciString;
    
    /**
     * Constructor for objects of class Decimal
     */
    public Decimal(PrintWriter pw)
    {
        // initialise instance variables
        this.pw = pw;
        binaryString = "";
        hexaDeciString = "";
    }

    /**
     * Convert decimal to binary 
     */
    public void decToBin()
    {
        inputDec();
        toBin();
        outBin();
    }
    
    /**
     * Convert decimal to hexadecimal 
     */
    public void decToHex()
    {
        inputDec();
        toHex();
        outHex();
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    private void inputDec()
    {
        // put your code here
        System.out.println("Enter the integer you would like to convert:\n");
        
        // read user input
        Scanner reader = new Scanner(System.in);
        
        this.input = reader.nextInt();
        
        if (input <= 1) {
            System.out.println("Error: Not a positive number");
            return;
        }
        
        this.num = input;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void toBin()
    {
        // put your code here
         int a, index = 0;

         //int binary[] = new int[40];
         while(num > 0){
             a = num%2;
             binaryString = binaryString + "" + a;
             num = num/2;
         }
    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void outBin()
    {
        // put your code here
        System.out.println("The Binary represenation is: " + binaryString + "\n");
    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void toHex()
    {
             // char array to store hexadecimal number
        char[] hexaDecimal = new char[100];

        // counter for hexadecimal number array
        int i = 0;
        while(num!=0)
        {   
            // temporary variable to store remainder
            int temp  = 0;
          
            // storing remainder in temp variable.
            temp = num % 16;
          
            // check if temp < 10
            if(temp < 10)
            {
                hexaDecimal[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hexaDecimal[i] = (char)(temp + 55);
                i++;
            }
          
            num = num/16;
        }
      
        // printing hexadecimal number array in reverse order
        for(int j=i-1; j>=0; j--)
            hexaDeciString = hexaDeciString + hexaDecimal[j];     
    }

    /**
     * An example of a method - replace this comment with your own
     */
    private void outHex()
    {
        // put your code here
        System.out.println("The HexaDecimal represenation is: "
        + hexaDeciString + "\n");
    }

}
