package tests;


import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import unit_testing.Account;
import unit_testing.Bank;

/**
 *
 * @author mathiasjepsen
 */
public class UnitTests {

    static Bank bank;
    static boolean randomBool;

    public UnitTests() {
    }

    @BeforeClass
    public static void setUpClass() {
        bank = new Bank();
        Random random = new Random();
        randomBool = random.nextBoolean();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Ignore("Ignoring test")
    @Test
    @DisplayName(value="eightDifferentAssertions")
    public void thisWillBeRenamedByTheAnnotation() throws InterruptedException {
        Account account = new Account(100.0);
        double interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, 5, 0);
        assertNotEquals(interest, 6, 0);
        assertTrue(interest == 5);
        assertFalse(interest == 6);
        assertAll("Header string",
                () -> assertTrue(interest == 5),
                () -> assertFalse(interest == 6)
        );
        assertNull(null);
        assertNotNull(account);
        assertArrayEquals(new int[10], new int[10]);
        //assertTrue(randomBool);
        //assertTimeout(Duration.ofMillis(5000), () -> Thread.sleep(8000));
//        assertTrue(false, () -> {
//            String message = "Printing something to the console from a lambda.\n";
//            System.out.println(message);
//            return message;
//        });
//        assertAll(this::thisWillBeRenamedByTheAnnotation);
    }

    @Test
    public void ShouldReturnThreePercentInterest() {
        Account account = new Account(50.0);
        double interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(1);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(0);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(2);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(100);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(99);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(98);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.03, 0);

        account.setBalance(-100);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.03, 0);
    }

    @Test
    public void ShouldReturnFivePercentInterest() {
        Account account = new Account(500.0);
        double interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(100);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(99);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(101);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(999);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(1000);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(998);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.05, 0);

        account.setBalance(-100);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.05, 0);
    }

    @Test
    public void ShouldReturnSevenPercentInterest() {
        Account account = new Account(10000.0);
        double interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(1000);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(999);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(1001);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(1000000);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(1000001);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(99999);
        interest = bank.calculateYearlyInterest(account);
        assertEquals(interest, account.getBalance() * 0.07, 0);

        account.setBalance(-100);
        interest = bank.calculateYearlyInterest(account);
        assertNotEquals(interest, account.getBalance() * 0.07, 0);
    }
}
