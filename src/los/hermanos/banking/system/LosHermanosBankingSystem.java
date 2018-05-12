package los.hermanos.banking.system;

/**
 *
 * @author GHAMRY and HAZEM
 */
public class LosHermanosBankingSystem {

    public static void main(String[] args) {
        Account a = new Account("a", "Platinum");
        a.showDetails();
        a.deposit(100);
        a.showDetails();
        a.withdraw(50);
        a.showDetails();
        
        Account b = new Account("b", "Titanium");
        b.showDetails();
        
        a.transfer(b, 10);
        a.showDetails();
        b.showDetails();
    }
    
}
