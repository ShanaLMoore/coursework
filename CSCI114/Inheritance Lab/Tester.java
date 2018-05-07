import java.util.ArrayList;

/**
 * Tests the inheritance classes
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Tester
{
    public static void main(String arg[])
    {
        // create some bank accounts
        ArrayList<Account> accounts = new ArrayList<>();

        Account personal = new Account("987", 200.0);
        accounts.add(personal);

        Savings business = new Savings("654", 500.0);
        accounts.add(business);

        // do some transactions
        System.out.println("Transactions");
        // on Account object
        personal.dep(50.0);
        personal.wd(98.0);
        personal.wd(76.0);
        personal.wd(54.0);

        // on Savings object
        business.wd(300.0);
        business.wd(100.0);
        business.dep(200.0);

        // print bank accounts
        System.out.println("\nPrint bank accounts");
        for (Account a : accounts)
            System.out.println(a.toString());
    }
}