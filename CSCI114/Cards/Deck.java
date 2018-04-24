//import libraries
import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a deck of cards
 *
 * @author Shana Moore
 * @version April 22, 2018
 */
public class Deck
{
    // declare instance variables
    private ArrayList<Card> cards;

    //Declare constants
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};  
    private static final String[] SUITS = {"Clubs","Diamonds", "Hearts", "Spades"};
    
    /**
     * Constructor for objects of class Deck. Creates a brand new, 
     * fresh deck of 52 cards in sorted order, rank within suit.  
     * Suit order is clubs, diamonds, hearts then spades.
     */
    public Deck()
    {
        // initialize deck
        cards = new ArrayList<Card>();

        // loop through SUITS
        for (int i = 0; i < SUITS.length; i ++) {
            // and loop through RANKS
            for (int j = 2; j < (RANKS.length + 2); j++){
                // create a new card object and add it to the cards array list
                cards.add(new Card(j, i));
            }
        }
    }

    /**
     * Shuffles the deck of cards into a random order.
     *
     */
    public void shuffle()
    {
        int index_1, index_2; 
        Random rand = new Random();
        Card temp; 
        
        for(int i = 0; i < cards.size(); i++){
            index_1 = rand.nextInt(cards.size()-1);
            index_2 = rand.nextInt(cards.size()-1);
            
            temp = (Card) cards.get(index_2);
            cards.set(index_2, cards.get(index_1));
            cards.set(index_1, temp);
        }
    }
    
    /**
     * Deals a card from the top of the deck.  Must remove and return 
     * the card at index 0, reducing the size of the deck.
     *
     *Must print an appropriate error message and exit the program if
     *the deck is empty.
     * @return    card from the top of the deck
     */
    public Card dealCard()
    {
        if (cards.size() == 0)
            System.out.println("ERROR: The deck is empty");
            
        // remove first card from cards array list
          return cards.remove(0);

    }

    /**
     * Must nicely format a deck.  Break the line every 13 cards to 
     * make a full deck easy to read.
     *
     * @return    string representation of a deck
     */
    
    //TODO: fix bug once dealCard() is called
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        int k = 0; 
        // print shuffled deck
        for (int i = 0; i < SUITS.length; i++) {
            
            for (int j = 1; j <= RANKS.length; j++){
                sb.append(cards.get(k++) + " ");
            } 
            sb.append("\n");
        }

        return sb.toString();
    }

}
