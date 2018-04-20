
/**
 * Represents one single playing card
 *
 * @author Shana Moore
 * @version April 20, 2018
 */
public class Card
{
    //Declare instance variables
    private final int rank;
    private final int suit;
    
    // Declare Constants - RANKS
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
    
    // Declare Constants - SUITS
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
        // validate rank
        validRank(rank);
        // validate suit
        validSuit(suit);
        
        this.rank = rank;
        this.suit = suit;

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
        // valid if rank value is >= TWO, AND, <= ACE
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
        // valid if suit value is >= CLUBS, AND, <= SPADES
        return CLUBS <= suit && suit <= SPADES;
    }

    /**
     * A method that converts rank to string representation
     *
     * @param     rank
     * @return    rank character
     */
    /**public static String rankToString(int rank)
    {
        // return approriate characters for rank
        switch (rank) {
        case TWO:
            return "2";
        case THREE:
            return "3";
        case FOUR:
            return "4";
        case FIVE:
            return "5";
        case SIX:
            return "6";
        case SEVEN:
            return "7";
        case EIGHT:
            return "8";
        case NINE:
            return "9";
        case TEN:
            return "10";
        case JACK:
            return "J";
        case QUEEN:
            return "Q";
        case KING:
            return "K";
        case ACE:
            return "A";
        default:
            //Handle an illegal argument
            return null;
        } 
    }

    /**
     * A method that converts suit to string representation
     *
     * @param     suit
     * @return    suit character
     */
    /**public static String suitToString(int suit)
    {
        // return special characters for suit
        switch(suit){
        case CLUBS: 
            return "♣";
        case DIAMONDS:
            return "♦";
        case HEARTS: 
            return "♥";
        case SPADES:
            return "♠";
        default:
            //Handle an illegal argument
            return null;
        }
    } */


    /**
     * A method that nicely formats a card
     *
     * @param     int rank, int suit
     * @return    the sum of x and y
     */
    public void toString(int rank, int suit)
    {
        // variable to hold special character
        String out = "";

        // Use unicode character codes to get the single special character for suit
        
        if(suit == CLUBS)
            out += '\u2663';    // Unicode char for black club
        else if(suit == DIAMONDS)
            out += '\u2662';    // white diamond.  Closest to red
        else if(suit == HEARTS)
            out += '\u2661';    // white heart
        else if(suit == SPADES)
            out += '\u2660';    // black spade
        
        // put your code here
        System.out.printf("rank %d, suit %d is '%d%s' ", rank, suit,  out);
    }

}
