package abstractiondemo;

// Example for - An abstract class can inherit from a normal class

// Normal class (concrete)
class Vehicle1 {
    public void fuel() {
        System.out.println("Vehicle uses fuel.");
    }
}

// Abstract class inheriting from normal class
abstract class Car1 extends Vehicle1 {
    // New abstract method
    public abstract void start();
}

// Concrete class implementing abstract method
class Sedan extends Car1 {
    @Override
    public void start() {
        System.out.println("Sedan starts with a push button.");
    }
}

public class Example7 {
    public static void main(String[] args) {
        Sedan myCar = new Sedan();
        myCar.fuel();   // Inherited from Vehicle
        myCar.start();  // Implemented in Sedan
    }
}

