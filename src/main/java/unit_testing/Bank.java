package unit_testing;

/**
 *
 * @author mathiasjepsen
 */
public class Bank {
    
    public double calculateYearlyInterest(Account account) {
        double balance = account.getBalance();
        if (balance > 0.0 && balance < 100.0) {
            return balance * 0.03;
        } else if (balance >= 100.0 && balance < 1000.0) {
            return balance * 0.05;
        } else if (balance >= 1000.0) {
            return balance * 0.07;
        } else {
            return 0;
        }
    }
    
}
