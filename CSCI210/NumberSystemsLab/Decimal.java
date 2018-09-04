//import libraries
import java.util.*; // for Scanner, IOException
import java.io.*; // for PrintWriter

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
    // instance variables
    private PrintWriter pw;
    private int input, num = 0;
    private String binaryString, hexaDeciString;
    
    /**
     * Constructor for objects of class Decimal
     */
    public Decimal(PrintWriter pw)
    {
        // initialise instance variables
        this.pw = pw;
    }

    /**
     * Method containing method calls for user input, conversion
     * and output of a decimal integers to binary representation
     */
    public void decToBin()
    {
        inputDec();
        toBin();
        outBin();
    }
    
    /**
     * Method containing method calls for user input, conversion
     * and output of a decimal integers to hexadecimal representation
     */
    public void decToHex()
    {
        inputDec();
        toHex();
        outHex();
    }
    
    /**
     * Retrieves user input
     */
    private void inputDec()
    {    
        // output to console
        System.out.println("Enter the integer you would like to convert:\n");

        // output to csis.txt file
        pw.println("Enter the integer you would like to convert:\n");
        
        // read user input
        Scanner reader = new Scanner(System.in);
        
        try 
        {
          this.input = reader.nextInt();         
        }
        catch(InputMismatchException exception)
        {
            // print error messages if input is not an integer
            System.out.println("Invalid input. Please enter a decimal integer.");
            pw.println("Invalid input. Please enter a decimal integer.");
            System.exit(0);
        }           
        
        if(input >= 0 )
        {
            this.num = input;
            pw.println("User Input: " + input);
        }
    }

    /**
     * Converts decimal integer to binary number
     */
    private void toBin()
    {
         String str = ""; 
         String val = "4";
         binaryString = "";
         
         for(int n = 0; n < 32; n++)
         {
             if(num % 2 == 1)
             {
                 str = "1" + str;
             }
             
             if(num % 2 == 0)
             {
                 str = "0" + str;
             }
             
             num = num / 2;
         }
         
         // include space separating nibbles
         binaryString = str.replaceAll("(.{" + val + "})", "$1 ").trim();

    }

    /**
     * Outputs string to console and file to display binary
     * conversion
     */
    private void outBin()
    {
        // output to console
        System.out.println("The Binary represenation is: "
        + binaryString + "\n");
        
        // output to csis.txt file
        pw.println("The Binary represenation is: "
        + binaryString + "\n");
    }

    /**
     * Converts decimal integer to hexadecimal
     */
    private void toHex()
    {
        // char array to store hexadecimal number
        char[] hexaDecimal = new char[100];
        hexaDeciString = "";
        // counter for hexadecimal number array
        int i = 0;
        while(num!=0)
        {   
            // temporary variable to store remainder
            int remainder  = 0;
          
            // storing remainder in temporary variable.
            remainder = num % 16;
          
            // check if remainder < 10
            if(remainder < 10)
            {
                hexaDecimal[i] = (char)(remainder + 48);
                i++;
            }
            else
            {
                hexaDecimal[i] = (char)(remainder + 55);
                i++;
            }
          
            num = num/16;
        }
      
        // printing hexadecimal number array in reverse order
        for(int j=i-1; j>=0; j--)
            hexaDeciString = hexaDeciString + hexaDecimal[j];     
    }

    /**
     * Outputs string to console and file to display hexadecimal
     * conversion
     */
    private void outHex()
    {
        // output to console
        System.out.println("The HexaDecimal represenation is: "
        + hexaDeciString + "\n");
        
        // output to csis.txt file
        pw.println("The HexaDecimal represenation is: "
        + hexaDeciString + "\n");
    }

}
