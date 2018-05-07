//import libraries
import java.lang.String;

/**
 * Savings is an Account that deposits/withdrawals money from a savings account/
 * Inherits from Account
 * 
 * @author Shana Moore
 * @version May 04, 2018
 */
public class Savings extends Account
{

    /**
     * Constructor for objects of class Savings
     */
    public Savings(String ID, double startingBalance)
    {
        // initialise instance variables - use superclass constructor
        super(ID, startingBalance);
        
        // set the state of the account
        active();
    }

    /**
     * active() -  a boolean variable that maintains the status of the savings account
     *
     * @return    true if account's balance is greater than $250.00, otherwise false
     */
    public boolean active()
    {
        // return true only if balance is greater than 250
        if ( super.getBalance() > 250 ){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * wd() - call Account wd() to do the withdrawal
     *
     * @param  double amount  the withdraw amount in dollars
     */
    public void wd(double amount)
    {
        /* a withdrawal is not allowed if the account is not active. Instead a message containing the savings account's ID 
        must be printed e.g. Savings ID 456: Withdrawal not allowed */
        if ( active() == false ){
            System.out.println("Savings ID " + super.getID() + ": Withdrawal not allowed");
        } else {
            // use the superclass method and reset state 
            super.wd(amount);
            active();
        }
    }

    /**
     * dep() - call Account dep() to do the deposit
     *
     * @param  double amount  the deposit amount in dollars
     */
    public void dep(double amount)
    {
        // use the superclass method and reset state 
        super.dep(amount);
        active();
    }

    /**
     * toString() - override superclass method to return a String that represents the Savings object, 
     * must be in standardized formatting
     *
     * @return    e.g. "Savings[ID=456, balance=300.0, deposits=1, withdrawals=1, service=8.0][active=false]"
     */
    public String toString()
    {
        // add to super class toString() method 
        return super.toString() + "[active=" + active() + "]";
    }

}
