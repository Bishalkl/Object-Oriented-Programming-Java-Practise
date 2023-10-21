package abstraction;

// super class
abstract class Employee{

    // field
    protected String name;
    protected double salary;

    // constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // method
    public abstract double  displayPaychek();


    // get
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

}

// sub cLass

// manager
class Manager extends Employee{

    // constructor
    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public double displayPaychek(){
        System.out.println();
        System.out.println("Name of Employeer: "+ super.name+".");
        System.out.println("The salary is Rs."+super.salary * 100 +".");
        return salary;
    }
}

// Intern
class Intern extends Employee{

    // constructor
    public Intern(String name, double salary){
        super(name, salary);
    }

    @Override
    public double displayPaychek(){
        System.out.println();
        System.out.println("Name of Employeer: "+ super.name+".");
        System.out.println("The salary is Rs."+super.salary * 10 +".");
        System.out.println();
        return salary;
    }
}

public class Four {
    public static void main(String[] args) {
        // Test manager
        Employee m1 = new Manager("Bishal korala", 10000);
        m1.displayPaychek();

        // Test Intern
        Employee i1 = new Intern("Bishnu Limbu", 10000);
        i1.displayPaychek();


    }
}
