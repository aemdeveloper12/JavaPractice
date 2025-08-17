package Inheritance;

class Parent{
    public void fun(){
        System.out.println("Parent fun()");
    }
}

class child extends Parent{
    public void fun(){
        System.out.println("Inside child fun()");
    }
}
public class Rule1AccessSpecifier {
    public static void main(String[] args) {
        child c = new child();
        c.fun();
    }
}
