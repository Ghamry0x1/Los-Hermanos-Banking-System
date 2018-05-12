package los.hermanos.banking.system;

/**
 *
 * @author GHAMRY and HAZEM
 */
public class Account {
    String name, accountType;
    static int counter = 1;
    int accountNumber;
    int accountBalance;
    
    public Account(String name, String accountType) {
        this.name = name;
        this.accountType = accountType;
        this.accountNumber = counter;
        counter++;
        this.accountBalance = 0;
    }
    
    public void showDetails() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("");
    }
    
    public boolean deposit(int amount) {
        if(amount >= 0) {
            accountBalance += amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int amount) {
        if(amount > this.accountBalance || amount < 0)
            return false;
        accountBalance -= amount;
        return true;
    }
    
    public boolean transfer(Account receiverAccount, int amount) {
        if(this.withdraw(amount) && this.deposit(amount))
            return true;
        return false;
    }
    
}
