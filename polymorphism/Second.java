package polymorphism;

// creating a superclass
class Animal{

    // method 
    public void soundMake(){
        System.out.println("Animal sound:");
    }
}

// creating subclass
class Dog extends Animal{

    // method for dog
    public void soundMake(){
        System.out.println("Bark!!");
    }
}

// create subclass
class Cat extends Animal{

    // method for cat
    public void soundMake(){
        System.out.println("Meow!!");
    }
}

// create subclass
class Duck extends Animal{

    // method for duck
    public void soundMake(){
        System.out.println("Quack!!");
    }
}
public class Second{
    public static void main(String[] args) {
        
        // Test aimal
        Animal animal = new Animal();
        animal.soundMake();
        
        // Test Dog
        Animal dog = new Dog();
        dog.soundMake();

        // Test Cat
        Animal cat = new Cat();
        cat.soundMake();

        // Test Duck
        Animal duck = new Duck();
        duck.soundMake();

    }
}
