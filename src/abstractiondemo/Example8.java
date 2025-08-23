package abstractiondemo;

// Example for - Abstract class object can't be created/instantiated. If you want to create it then it 
//must be inherited from another class

/* Animal is abstract → cannot be instantiated.

Dog inherits from Animal and implements sound().

We can then create a Dog object, but reference it using the abstract class type (Animal myDog = new Dog();).

Abstract class object ❌ → Not possible.

Subclass object ✅ → Possible, but only after subclass implements all abstract methods.

You can use abstract class as a reference type, but object must be of a concrete subclass. */


// Abstract class
abstract class Animal2 {
    public abstract void sound();  // Abstract method
}

// Concrete subclass
class Dog2 extends Animal2 {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}

public class Example8 {
    public static void main(String[] args) {
        // ❌ Cannot instantiate abstract class directly
        // Animal a = new Animal();  // Compile-time error
        
        // ✅ Create object of subclass
        Animal2 myDog = new Dog2();
        myDog.sound();  // Output: Bark!
    }
}
