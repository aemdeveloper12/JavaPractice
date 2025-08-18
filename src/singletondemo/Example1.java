package singletondemo;

public class Example1 {
    //At any condition we are allowed to create only one instance of the class
    //since we can't say new Abc() because our constructor is private 
    // Below is the only way to get the instance of the class, this is the advantage of using singleton class
    public static void main(String[] args) {
        Abc obj1 = Abc.getInstance();
}
    }
//We want everyone to create only instance of the class
//For this, step 1 we have to create static instance of the class
//step 2 , don't allow to create instance with default constructor
//step 3, create a method which should be static which will return the instance of our class Abc
// with some sensible method name
//With this we are allowing only one instance of the class
class Abc{
    static Abc obj = new Abc(); // eagerly instance creation
    private Abc(){//private constructor so that we can't create the object explicitly

    }

    public static Abc getInstance(){
        return obj;
    }

}