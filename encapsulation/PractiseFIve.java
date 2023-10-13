package encapsulation;

// class for Bank
class Bank{
    // field 
    private double balance = 0;

    // getter method
    public double getBalance(){
        return balance;
    }

    // setter method 
    public void setBalance(double balance){
        this.balance = balance;
    }

    // method for depositing
    public void deposit(double amount){
        if(amount > 0){
            balance = amount + balance;
            System.out.println("Deposite amount is Rs."+amount+".");
            System.out.println("updated balance is Rs."+balance+".");
        }else{
            System.out.println("You don't have sufficent amount");

            // for nextline to make gap..
            System.out.println();
        }
    }

    // method for withdrawing
    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance = balance - amount;
            System.out.println("Withdrawn amount is Rs."+amount+".");
            System.out.println("Updated balance is Rs."+balance+".");
            
            // for nextline to make gap..
            System.out.println();
        }else{
            System.out.println("you don't have sufficent amount");
        }
    }
}
public class PractiseFIve {
    public static void main(String[] args) {
        Bank ac1 = new Bank();
        ac1.deposit(1000000);
        ac1.withdraw(50000);
    }
}
