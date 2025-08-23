package abstractiondemo;

// Example for - An abstract class can inherit from another abstract class

/* If an abstract class extends another abstract class, it does not have to implement the abstract methods of the parent.

It can choose to leave them unimplemented (because it’s still abstract).

Or it can implement some (or all) of them.

A concrete class that eventually extends this chain must implement all remaining abstract methods. */


// Abstract parent class
abstract class Animal1 {
    public abstract void sound();  // Abstract method
}

// Abstract child class
abstract class Pet extends Animal1 {
    // It can add new abstract methods
    public abstract void play();
    
    // It can also implement parent's abstract method if it wants
    // public void sound() { System.out.println("Some pet sound"); }
}

// Concrete class (must implement all abstract methods from the hierarchy)
class Dog1 extends Pet {
    public void sound() {
        System.out.println("Bark!");
    }
    public void play() {
        System.out.println("Dog loves to play fetch.");
    }
}

public class Example6 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.sound();  // Bark!
        dog.play();   // Dog loves to play fetch.
    }
}

