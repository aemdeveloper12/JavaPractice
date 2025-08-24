package interfacedemo;

/* Code Flexibility

We can swap implementations at runtime without changing business logic. 

Here, the client code doesn’t care how the payment is processed. It just relies on the Payment interface. That’s flexibility + loose coupling.*/

/* Interface reference can point to any implementing class object → Polymorphism.

This leads to:
✅ Loose coupling → Less dependency on concrete classes.
✅ Code reduction → Reuse of common logic via interface type.
✅ Code flexibility → Easily add/replace implementations without touching existing code. */

/* Abstract Class → when classes share a common base and also need shared code (fields, partial implementation).
Example: Vehicle → Car, Bike.

Interface → when you want to define capabilities/contract that can be applied to any class, regardless of hierarchy.
Example: Comparable, Serializable, Runnable, Payment.

✅ Abstract class = “is-a” hierarchy with shared code.
✅ Interface = “can-do” behavior across unrelated classes, better polymorphism.

Easy Rule to Remember

Abstract class = “is-a” hierarchy
(Car is a Vehicle, Dog is an Animal).

Interface = “can-do” contract
(Dog can do Runnable, File can do Serializable, Class can do Comparable).

Real-world shortcut:

Abstract class = family tree 👨‍👩‍👧‍👦

Interface = job skill 🎓 (e.g., “can drive,” “can code,” “can sing”)*/

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class Rule2PaymentExample {
    public static void main(String[] args) {
        Payment payment;  
        
        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UPIPayment();   // Easily switch
        payment.pay(2000);
    }
}
