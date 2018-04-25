package los.hermanos.banking.system;

/**
 *
 * @author GHAMRY and HAZEM
 */
public class Account {
    String name, accountType;
    int accountNumber, accountBalance;
    
    public Account(String name, String accountType, int accountNumber, int accountBalance) {
        this.name = name;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance = 0;
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
