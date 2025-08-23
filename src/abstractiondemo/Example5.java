package abstractiondemo;

// Example for - A normal class can inherit form abstract class

// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    public abstract void start();
    
    // Concrete method (has body)
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Normal class extending abstract class
class Car extends Vehicle {
    // Must implement the abstract method
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

public class Example5 {
    public static void main(String[] args) {
        Car car = new Car();   // Normal class object
        car.start();           // Calls implemented method -> Car starts with a key.
        car.stop();            // Inherited method -> Vehicle stopped.
    }
}


