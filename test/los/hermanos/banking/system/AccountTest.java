package los.hermanos.banking.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GHAMRY
 */
public class AccountTest {
    
    Account instance;
    
    public AccountTest() {
        instance = new Account("testAcc", "Platinum");
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    @Test
    public void testMain() {
        System.out.println("deposit");
        Account receiverAccount = new Account("recAccTest", "Titanium");
        int amount = -5;
        instance.deposit(amount);
        try {
            assertEquals(0, instance.accountBalance);
        } catch(Exception e) {
            fail("The testMain case has failed.");
        }
        instance.deposit(100);
        assertEquals(100, instance.accountBalance);
        
        amount = 1000;
        try {
            instance.withdraw(amount);
            assertEquals(100, instance.accountBalance);
        } catch(Exception e) {
            fail("The testMain case has failed.");
        }
        amount = -1000;
        try {
            instance.withdraw(amount);
            assertEquals(100, instance.accountBalance);
        } catch(Exception e) {
            fail("The testMain case has failed.");
        }
        instance.withdraw(100);
        assertEquals(0, instance.accountBalance);
        
        amount = 50;
        try {
            assertFalse("This transfer didn't go correctly", instance.transfer(receiverAccount, amount));
        } catch(Exception e) {
            fail("The testMain case has failed.");
        }
    }
    
    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        int amount = -5;
        instance.deposit(amount);
        try {
            assertEquals(0, instance.accountBalance);
            instance.deposit(100);
            assertEquals(100, instance.accountBalance);
        } catch(Exception e) {
            fail("The testDeposit case has failed.");
        }
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw1() {
        System.out.println("withdraw");
        int amount = 1000;
        try {
            instance.withdraw(amount);
            assertEquals(0, instance.accountBalance);
        } catch(Exception e) {
            fail("The testWithdraw1 case has failed.");
        }
    }
    
    @Test
    public void testWithdraw2() {
        System.out.println("withdraw #2");
        int amount = -1000;
        try {
            instance.withdraw(amount);
            assertEquals(0, instance.accountBalance);
        } catch(Exception e) {
            fail("The testWithdraw2 case has failed.");
        }
    }

    /**
     * Test of transfer method, of class Account.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        Account receiverAccount = new Account("recAccTest", "Titanium");
        int amount = 100;
        try {
            assertFalse("This transfer didn't go correctly", instance.transfer(receiverAccount, amount));
        } catch(Exception e) {
            fail("The testTransfer case has failed.");
        }
    }
    
}