//import libraries
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A DealHands class controls everything and runs your classes
 *
 * @author Shana Moore
 * @version April 23, 2018
 */
public class DealHands
{
    public static void main(String [] args){
        // create a new deck object and print it out, nicely labelled
        Deck deck = new Deck();
        System.out.println("A brand new, fresh deck:\n");
        System.out.println(deck.toString());
        
        // shuffle the deck then prit it out, nicely labelled
        deck.shuffle();
        System.out.println("Shuffled:\n");
        System.out.println(deck.toString());
        
        /* prompt the user to enter the number of players, then read 
        this number from the keyboard*/
        Scanner reader = new Scanner(System.in);
        System.out.println("How many players?\n");
        int players = reader.nextInt();
        
        /* create a new array list object named hands and add this many 
        empty hand objects*/
        ArrayList<Hand> hand = new ArrayList<Hand>();
        
        for(int i = 0; i < players; i++){
            hand.add(new Hand());
        }   

        /* one card must be dealt from the deck to each hand in turn
        until all players have 5 cards */
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j < hand.size(); j++){
               Card currentCard = deck.dealCard();
               hand.get(j).addCard(currentCard);
            }
        }
        
        // print each hand
        for(Hand h: hand){
            System.out.println(h.toString() + "\n");
        }
 
        // print what remains in the deck, nicely labelled
        System.out.println("What remains:\n");
        System.out.println(deck.toString() + "\n");
        
        // test error handling, nicely labelled
        System.out.println("Test error handling:\n");
        
        /* try to create a bad card.  (Comment out your System.exit() 
        method calls, so that the program keeps running after this…)*/
        new Card(15,-1);        
        
        /* write a loop that deliberately tries to deal a card from 
        the deck after it has been emptied*/        
        for (int x = 52; x >= 0; x--){
            deck.dealCard();
        }        
        
        

        


    }
}
