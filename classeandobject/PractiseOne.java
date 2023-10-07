package classeandobject;

class Student{
    // fields
    String name;
    int age;
    int studentID;

    // Constructor
    public Student(String name, int age, int studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // Method for print their information
    public void displayInformation(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(studentID);
        System.out.println();
    }

}

public class PractiseOne {
    public static void main(String[] args) {

        // adding the value in constructor and calling object:: 
        Student s1 = new Student("Bishal Koirala", 20, 123869);
        Student s2 = new Student("Bishnu Limbu", 20, 234535);

        // executing the object
        s1.displayInformation();
        s2.displayInformation();

    }
}
