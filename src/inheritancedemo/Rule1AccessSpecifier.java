package inheritancedemo;

class Parent{
    public void fun(){
        System.out.println("Parent fun()");
    }
}

class Child extends Parent{
    public void fun(){
        System.out.println("Inside child fun()");
    }
}
public class Rule1AccessSpecifier {
    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
    }
}
