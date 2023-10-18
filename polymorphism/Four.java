package polymorphism;

// Create a super class 
class BankAccount{

    //field
    private String name;
    private String id;
    private double balance;

    // constructor
    public BankAccount(String name, String id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;

    }

    // method for deposit
    public double depositAmount(double amount){
        balance = balance + amount;
        return balance;
    }

    // method for withdrawn
    public double withDrawn(double amount){
        System.out.println();
        if(amount <= balance){
            balance -= amount;
            System.out.println("After withdrawn Rs."+ amount+ " Balance is now Rs."+ balance+".");
        }else{
            System.out.println("You don't have enough balance!!");
            return 0.0;
        }
        return balance;
    }

    // getter method
    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    

}

// subclass
class SavingAccount extends BankAccount{

    // field
    private double limitAmount;

    // constructor
    public SavingAccount(String name, String id, double Balance, double limitAmount){
        super(name, id, Balance);
        this.limitAmount = limitAmount;
    }

    @Override
    public double withDrawn(double amount){
        if(amount <= getBalance() & amount <= limitAmount & amount > 0){
            return super.withDrawn(amount);
        }else{
            System.out.println("You don't have sufficent amount for withdraw process!!");
        }
        return getBalance();
    }
}

// subclass
class CheckingAccount extends BankAccount{


    // constructor
    public CheckingAccount(String name, String id, double Balance){
        super(name, id, Balance);
    }

    @Override
    public double withDrawn(double amount){
        System.out.println();
        if(amount <= getBalance() & amount > 0){
            return super.withDrawn(amount);
        }else{
            System.out.println("You don't have sufficent amount for withdraw");
        }
        return getBalance();
    }


}

public class Four{
    public static void main(String[] args) {
        
        // Test Savingaccount
        BankAccount s1 = new SavingAccount("Bishal","123455", 1000000, 70000);
        s1.depositAmount(100000);
        s1.withDrawn(12000);

        // Test Checkingaccount
        BankAccount c1 = new CheckingAccount("Bishnu Limbu", "1234566", 100000);
        c1.depositAmount(10000);
        c1.withDrawn(100000);
    }
}