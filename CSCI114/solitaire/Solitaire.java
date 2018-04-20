//import library to utilize ArrayLists
import java.util.ArrayList;

/**
 * Models the solitaire card game
 *
 * @author Shana Moore
 * @version March 23, 2018
 */
public class Solitaire
{    
    //Declare constants
    public static final int TOTAL_NUM_OF_CARDS = 15;
    
    //Declare instance variables
    private ArrayList<Integer> piles;
    /**
     * Constructor for objects of class Solitaire
     */
    public Solitaire()
    {
        // initialize instance variables
         this.piles = new ArrayList<Integer>();
         int num, max;
         max = TOTAL_NUM_OF_CARDS;
         
         //loop to build piles ArrayList with random numbers, while maintaining its combined sum TOTAL_NUM_OF_CARDS (15)
         while (max > 0){
             num = (int)(Math.random() * max) + 1;
             piles.add(num);
             max -= num;
         }
     
    }
    
    /**
     * Returns string format of the ArrayList piles for output
     *
     * 
     * @return    the piles array in a formatted string
     */
    public String toString()
    {
        //Return piles in string format
        return piles.toString();
    }

    /**
     * Returns true if solitaire is over and false if otherwise.
     * 
     *
     * @return    true or false
     */
    public boolean over()
    {
        //The solitaire game is over when the piles have size 1, 2, 3, 4, and 5, in any order.
        
        boolean isOver = true;

        if (piles.size() == 5){
            for (int i = 0;  i < piles.size(); i++) { 
                /*indexOf() - This method returns the index within this string of the first occurrence 
                of the specified character or -1, if the character does not occur.*/
                if((piles.indexOf(i + 1) == -1)){
                    isOver = false;
                    break;
                }
            }
        } else {
            isOver = false;
        }

        return isOver;
        
    }

    /**
     * Removes one card from each pile, to form a 
     * new pile with these cards. Note: New pile must be added at 
     * the beginning.
     *  
     */
    public void round()
    {
        //In each round remove one card from each pile, to form a new pile with these cards
        
        int nextPile = 0;
        
        for (int i = 0; i < piles.size(); i++){
            int val = piles.get(i);
            piles.set(i, val - 1);
            nextPile += 1;
        }
        
        //Add new pile to the beginning of the collection of cards
        piles.add(0, nextPile);
        
        //Remove pile if 0
        for (int i = 0; i < piles.size(); i++) {
            int val = piles.get(i);
            
            if (val == 0) {
                piles.remove(i);
                i -= 1;
            }
        }

    }

}

