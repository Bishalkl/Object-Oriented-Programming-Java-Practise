package polymorphism;

// creating super class
class Employee{

    // field
    protected String name;
    protected String id;
    protected double salary;


    // constructor
    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // getter method
    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }


    // getter
    public double salary(double amount){
        if(amount > 0){
            this.salary = amount;
        }else{
            System.out.println("Amount is not sufficent !!!");
        }
        return salary;
    }

    // method salary Calc
    public double calcSalary(){
        System.out.println(id);
        System.out.println(name);
        System.out.println("The salary is "+salary);
        return salary;
    }

}

// creating sub class
class Manager extends Employee{

    //field
    private double managerSalary;

    // constructor
    public Manager(String name, String id, double salary){
        super(name, id, salary);

    }

    @Override
    public double calcSalary(){
        managerSalary = getSalary() * 100;
        System.out.println("ID : "+getId()+".");
        System.out.println("Name : "+getName()+".");
        System.out.println("Total salary is Rs."+managerSalary+".");
        System.out.println();
        return managerSalary;
    }
}

// creating sub class
class Developer extends Employee{

    //field
    private double developerSalary;

    // constructor
    public Developer(String name, String id, double salary){
        super(name, id, salary);

    }

    @Override
    public double calcSalary(){
        developerSalary= getSalary() * 10;
        System.out.println("ID : "+getId()+".");
        System.out.println("Name: "+getName()+".");
        System.out.println("Total salary is Rs."+developerSalary+".");
        System.out.println();
        return developerSalary;
    }
}
public class Three {
    public static void main(String[] args) {

        // Test manager
        Employee manager = new Manager("Bishal koirala", "12343434", 12000);
        manager.calcSalary();

        // Test developer
        Employee developer = new Developer("Bishnu Limbu", "123859584", 12000);
        developer.calcSalary();
    }
}
