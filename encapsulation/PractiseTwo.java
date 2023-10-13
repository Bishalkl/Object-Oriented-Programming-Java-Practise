package encapsulation;

class Person{

    // field
    private String name;
    private int age;

    // method getter 
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // method setter 
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if( age > 0){
            this.age = age;
        }else{
            System.out.println("Error!!");
        }
    }

    // display it 
    public void displayInformation(){
        System.out.println(name);
        System.out.println(age);
    }

}
public class PractiseTwo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Bishal");
        p1.setAge(23);
        p1.displayInformation();
    }
}
