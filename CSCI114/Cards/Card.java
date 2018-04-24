//import libraries
import java.lang.String;

/**
 * Represents one single playing card
 *
 * @author Shana Moore
 * @version April 20, 2018
 */
public class Card
{
    //declare instance variables
    private final int rank;
    private final int suit;
    
    //declare constants
    private static final String[] SUIT = {"Clubs","Diamonds", "Hearts", "Spades"};
    private static final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};  
    
    // declare types of ranks
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;
    
    // declare types of suits
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;


    /**
     * Constructor for objects of class Card
     * 
     * Must print an appropriate error message and 
     * exit the program if the rank, suit are not valid.
     */
    public Card(int rank, int suit)
    {
        this.rank = rank;
        this.suit = suit;
        
        // validate rank and suit        
        if(validRank(rank) == false){
            System.out.println("In Card::ctor() -- rankIn not valid: " + rank);
            //System.exit(0);
        }
        
        if(validSuit(suit) == false){
            System.out.println("In Card::ctor() -- suitIn not valid: " + suit);
            //System.exit(0);
        }
    }

    /**
     * Returns rank value
     *
     * @return    rank
     */
    public int getRank()
    {
        return rank;
    }
    
    /**
     * Returns suit value
     *
     * @return    suit
     */
    public int getSuit()
    {
        return suit;
    }

    /**
     * A boolean method to validate rank
     *
     * @param     rank
     * @return    True or False
     */
    public static boolean validRank(int rank)
    {
        // valid if rank value is >= TWO (2), AND, <= ACE (14)
        return TWO <= rank && rank <= ACE;
    }

    /**
     * A boolean method to validate suit
     *
     * @param     suit
     * @return    True or False
     */
    public static boolean validSuit(int suit)
    {
        // valid if suit value is >= CLUBS (0), AND, <= SPADES (3)
        return CLUBS <= suit && suit <= SPADES;
    }

    /**
     * A method that nicely formats a card
     *
     * @param     int rank, int suit
     */
    
    public String toString()
    {
        // variable to hold special character
        String out = "";

        // use unicode character codes to get the single special character for suit
        if(suit == CLUBS)
            out += '\u2663';    // Unicode char for black club
        else if(suit == DIAMONDS)
            out += '\u2662';    // white diamond.  Closest to red
        else if(suit == HEARTS)
            out += '\u2661';    // white heart
        else if(suit == SPADES)
            out += '\u2660';    // black spade
        
        // nicely format string output of a card
        return String.format("%2s%1s", getRank(), out);
    }

}
