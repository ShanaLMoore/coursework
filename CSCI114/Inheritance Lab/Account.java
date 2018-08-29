//import libraries
import java.lang.String;

/**
 * Implements a simple bank account.
 *
 * @author Shana Moore
 * @version May 03, 2018
 */
public class Account
{
    // declare instance variables
    private String ID; // an identifying account number e.g. "123"
    private double balance; // balance of the account in dollars e.g. $1.23
    private int deposits; // number of deposits made this month
    private int withdrawals; // number of withdrawals made this month
    private double service; // maintain the total monthly service charges incurred here, in dollars
    
    // declare constants
    private static final double SERVICE_CHARGE_FEE = 1.0;
    private static final double WITHDRAWAL_FEE = 1.0;

    /**
     * Constructor for objects of class Account
     */
    public Account(String ID, double startingBalance)
    {
        // initialize instance variables
        this.ID = ID;
        this.balance = startingBalance;
       
        this.deposits = 0;
        this.withdrawals = 0;
        this.service = 0;
        
    }

    /**
     * getBalance() - a getter method for the account's balance
     *
     * @return    the balance of the account
     */
    public double getBalance()
    {
        // return the account's balance
        return balance;
    }

    /**
     * getID() - a getter method for the account's balance
     *
     * @return    the ID of the account
     */
    public String getID()
    {
        // return the account's ID
        return ID;
    }

    /**
     * dep() - a method to deposit an amount into the account's balance
     *
     * @param  double amount  the deposit amount in dollars
     */
    public void dep(double amount)
    {
        // add the deposit amount to the balance
        balance += amount;
        
        // add 1 to the number of deposits
        deposits += 1;
        
        // add a deposit fee of $1.00 to the monthly service charge
        service += SERVICE_CHARGE_FEE;
    }

    /**
     * wd() - a method to withdraw an amount from the account's balance
     *
     * @param  double amount  the withdraw amount in dollars
     */
    public void wd(double amount)
    {
        // subtract the withdrawal amount from the balance
        balance -= amount;
        
        // add 1 to the number of withdrawals
        withdrawals += 1;
        
        // add a withdrawal fee per withdrawal to the monthly service charge
        if (withdrawals <= 2 ){
            // the first 2 withdrawals cost $2.00 each
            service += ( WITHDRAWAL_FEE * 2 );
        } else {
            // withdrawals after the first 2 cost $3.00 each
            service += ( WITHDRAWAL_FEE * 3 );
        }
    }

    /**
     * toString() - Return a String that represents the Account object, must be in standardized formatting
     *
     * @return    e.g. "Account[ID=123, balance=748.0, deposits=1, withdrawals=3, service=2.0]"
     */
    public String toString()
    {
        return getClass().getName() + "[ID=" + ID + ", balance=" + balance + 
        ", deposits=" + deposits + ", withdrawals=" + withdrawals + ", service=" + service + "]";
    }

}
