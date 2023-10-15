package inheritance;

// super class 
class Animal{

    // method 
    public void makeSound(){
        System.out.println("does it  make sound ??");
    }
}
class Dog extends Animal{
    
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Bark");
    }
}
public class PractiseSix {
    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        Animal dog = new Dog();
        newAnimal.makeSound();
        dog.makeSound();

    }
}
