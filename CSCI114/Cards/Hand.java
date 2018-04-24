//import libraries
import java.util.ArrayList;

/**
 * Represents a hand of 5 cards.  A new hand always starts empty, then cards are dealt from the deck which are added to the hand.
 *
 * @author Shana Moore
 * @version April 22, 20182018
 */
public class Hand
{
    // declare instance variables
    private ArrayList<Card> cards;

    /**
     * Constructor for objects of class Hand
     */
    public Hand()
    {
        // must create a en empty hand
        cards = new ArrayList<Card>();
    }

    /**
     * Add a card to the end of the hand.
     *
     * @param  c  a card to be added
     */
    public void addCard(Card c)
    {
        // add a card from the deck to the end of the hand
        if (c == null)
            System.out.println("ERROR: a card must be present");
            
        cards.add(c);
    }
    
    /**
     * A method that returns string representations
     *
     * @return   string representation of cards
     */
    public String toString()
    {
        // No special formatting is required
        return cards.toString();

    }

}
