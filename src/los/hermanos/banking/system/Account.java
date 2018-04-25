package los.hermanos.banking.system;

import los.hermanos.banking.system.RandomCreditCardNumberGenerator.*;

/**
 *
 * @author GHAMRY and HAZEM
 */
public class Account {
    String name, accountType;
    String accountNumber;
    int accountBalance;
    
    public Account(String name, String accountType) {
        this.name = name;
        this.accountType = accountType;
        this.accountNumber = RandomCreditCardNumberGenerator.generateMasterCardNumber();
        this.accountBalance = 0;
    }
    
    public void showDetails() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
    
    public void deposit(int amount) {
        accountBalance += amount;
    }
        
    public int withdraw(int amount) {
        accountBalance -= amount;
        return amount;
    }
    
    public boolean transfer(Account receiverAccount, int amount) {
        this.accountBalance -= amount;
        receiverAccount.accountBalance += amount;
        return true;
    }
    
}
