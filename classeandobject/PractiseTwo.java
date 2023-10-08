package classeandobject;

class BankAccount{
    
    // field 
    private String accountNumber;
    private String accountHolder;
    double balance;

    //Constructor
    public BankAccount(String accountNumber, String accountHolder){

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // method for depositing 
    public void depositing(double amount){

        if(amount > 0){
            balance += amount;
            System.out.println("The total amount after depositing is Rs." + balance + ".");
            System.out.println("The total balance is Rs." + amount + ".");
        }else{
            System.out.println("You don't have any amount to doposite");
        }
        System.out.println();
    }

    // method for withdrawing
    public void withdrawing(double updateBalance){
        
        double withdraw = updateBalance;

        if(balance > 0 && updateBalance <= balance ){
             updateBalance= balance - updateBalance;
            System.out.println("The amount you withdrew: Rs." + withdraw);
           System.out.println("Your remaining balance after the withdrawal is Rs." + withdraw);
        }else{

            System.out.println("No withdrawals have been made, or you don't have a sufficient balance.");

        }
        System.out.println();
    }

    // method for displaying the current balance
    public void displaying(){
        // Print the account number
        System.out.println("Account Number: " + accountNumber);

        // Print the account holder's name
        System.out.println("Account Holder: " + accountHolder);

        // Print the current balance
        System.out.println("Balance: Rs." + balance);

        System.out.println();

    }


}

// creating the class 
public class PractiseTwo {
    public static void main(String[] args) {
        
        BankAccount a1 = new BankAccount("123456645", "Bishal koirala");
        BankAccount a2 = new BankAccount("124768576", "Bishnu Limbu");

        a1.depositing(10000);
        a1.withdrawing(500);
        a1.displaying();

        a2.depositing(100000);
        a2.withdrawing(50000);
        a2.displaying();
    }
}

