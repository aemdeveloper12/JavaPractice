package abstractiondemo;

//Example for - An abstract class can contain only concrete methods as well

/* To prevent direct instantiation of the base class (Vehicle), while still providing default implementations.

To enforce inheritance — subclasses must be used instead of the base class.

An abstract class may have only abstract methods (rare, but then it behaves like an interface in old Java versions).

An abstract class may have a mix of abstract + concrete methods (most common).

An abstract class may have only concrete methods (allowed, but then the only difference from a normal class is you cannot create its objects).
 */

// Abstract class with only concrete methods
abstract class Vehicle3 {
    public void fuel1() {
        System.out.println("Vehicle needs fuel to run.");
    }

    public void stop1() {
        System.out.println("Vehicle has stopped.");
    }
}

// Concrete subclass
class Car3 extends Vehicle3 {
    // No need to override anything, inherits as-is
}

public class Example9 {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // ❌ Not allowed (abstract)
        
        Car3 car = new Car3();   // ✅ Allowed
        car.fuel1();            // Inherited method
        car.stop1();            // Inherited method
    }
}

