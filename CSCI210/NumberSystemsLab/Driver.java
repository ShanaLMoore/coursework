//import libraries
import java.io.*;

/**
 * Required class: no change to the code are allowed.
 * 
 * Project Title: Number Systems Lab
 * Project Description: An object-oriented Java program that performs number conversions.
 * Version or Date: 09/04/2018
 * How to Start the Project: Run Main() from the Driver class.
 * Author: Shana Moore
 * Palomar ID: 011780377
 * User Instructions:
 */
public class Driver
{
    public static void main(String[] args) throws IOException
    {
        int choice;
        
        PrintWriter pw = new PrintWriter(new FileWriter("csis.txt"));
        Decimal dec = new Decimal(pw);
        Binary bin = new Binary(pw);
        Hexadecimal hex = new Hexadecimal(pw);
        Menu menu = new Menu(pw);
        
        do {
            menu.display();
            choice = menu.getSelection();
            switch (choice){
                case 1: dec.decToBin(); break;
                case 2: dec.decToHex(); break;
                case 3: bin.binToDec(); break;
                case 4: bin.binToHex(); break;
                case 5: hex.hexToDec(); break;
                case 6: hex.hexToBin(); break;
            }
        } while (choice != 7);
        pw.close();
    }
}
