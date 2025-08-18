package inheritancedemo;

class Plane1{

}

class CargoPlane1 extends Plane1{

}

class Parent1{
    public Plane1 fun1(){
        System.out.println("Parent fun()");
        Plane1 p = new Plane1();
        return p;
    }
}

class Child1 extends Parent1 {
    public CargoPlane1 fun1(){
        System.out.println("Inside child fun()");
        CargoPlane1 cp = new CargoPlane1();
        return cp;
    }
}
public class Rule3AccessSpecifier {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.fun1();
    }
    
}
