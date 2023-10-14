package inheritance;

// superclass
class Person {
    // attributes
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// subclass
class Student extends Person {
    // attributes
    private String studentId;

    // constructor
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // method for display
    public void display() {
        System.out.println("Name: " + getName()); // Use getter method
        System.out.println("Age: " + getAge());   // Use getter method
        System.out.println("Student ID: " + studentId);
    }
}

public class PractiseFour {
    public static void main(String[] args) {
        Student student = new Student("Bishal Koirala", 24, "123kj4k");
        student.display();
    }
}
