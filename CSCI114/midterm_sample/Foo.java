
/**
 * Write a description of class Foo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Foo
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Foo
     */
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        // create an array list
        int x = 3;    // new 'diamond syntax'
       
        
        
        for (int i = 2; i <5; ++i){
            if(i%2 == 0){
                x = x + 1;
            }
        }

        System.out.println(x);

    }
}
