package interfacedemo;

// Example for - Interfaces promote polymorphism. An interface type reference can pint to implemnting class
//objects. This achieves loose coupling, code reduction and code flexibility.

/* 1. Loose Coupling

Code depends on the interface, not the concrete class.

If tomorrow we add class Cow implements Animal, we don’t need to change existing code — just use Animal a = new Cow();.

This makes systems flexible and easy to extend.

2. Code Reduction

We can write common logic once using the interface type. */


// Interface
interface Animal {
    void sound();
}

// Classes implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Bark!");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow!");
    }
}

public class Rule2 {
    public static void main(String[] args) {
        // Interface reference pointing to Dog object
        Animal a1 = new Dog();
        a1.sound();  // Bark!
        
        // Interface reference pointing to Cat object
        Animal a2 = new Cat();
        a2.sound();  // Meow!
    }
}

