package Exercises.InterfacesAndAbstraction;

// Abstract class - can have abstract and regular methods
abstract class Animal {
    // Abstract method (no body) - subclasses must implement
    public abstract void animalSound();
    
    // Regular method (has body) - subclasses inherit this
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Interface - all methods must be implemented by classes that use it
interface Pet {
    void play();   // Must implement
    void eat();    // Must implement
}

// Subclass extends Animal AND implements Pet interface
class Pig extends Animal implements Pet {
    // Implementing abstract method from Animal
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    
    // Implementing play() from Pet interface
    public void play() {
        System.out.println("The pig is rolling in mud");
    }
    
    // Implementing eat() from Pet interface
    public void eat() {
        System.out.println("The pig is eating");
    }
}

// Another class that implements Pet interface
class Dog extends Animal implements Pet {
    public void animalSound() {
        System.out.println("The dog says: woof woof");
    }
    
    public void play() {
        System.out.println("The dog is fetching a ball");
    }
    
    public void eat() {
        System.out.println("The dog is eating kibble");
    }
}

class InterfacesAndAbstraction {
    public static void main(String[] args) {
        System.out.println("=== Using Abstract Class ===");
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();  // Inherited from Animal
        
        System.out.println("\n=== Using Interface ===");
        Pet myPet = new Dog();  // Interface reference
        myPet.play();
        myPet.eat();
        
        System.out.println("\n=== Polymorphism ===");
        Animal[] animals = {new Pig(), new Dog()};
        for (Animal a : animals) {
            a.animalSound();
        }
    }
}
