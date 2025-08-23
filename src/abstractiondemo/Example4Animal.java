package abstractiondemo;

//Example for: An abstract class can contain both abstract methods as well as concrete methods

// Abstract class
abstract class Animal {
    
    // Abstract method (no body, must be implemented by subclasses)
    public abstract void sound();
    
    // Concrete method (has body, common for all subclasses)
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Must provide implementation for abstract method
    public void sound() {
        System.out.println("Bark!");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Must provide implementation for abstract method
    public void sound() {
        System.out.println("Meow!");
    }
}

public class Example4Animal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Bark!
        dog.sleep();  // Sleeping...
        
        Animal cat = new Cat();
        cat.sound();  // Meow!
        cat.sleep();  // Sleeping...
    }
}

