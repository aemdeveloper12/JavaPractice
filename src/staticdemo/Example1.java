package staticdemo;

class Test{
    static int a,b;
    static{
        System.out.println("Inside static block");
        a=10;
        b=20;
    }
    static void fun(){
        System.out.println("Inside static method");
    }
    int x,y;
    {
        System.out.println("Inside Instance block");
    }
    void fun2(){
        System.out.println("Inside Instance Method");
    }
    Test(){
        System.out.println("Inside Constructor");
        x=30;
        y=40;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Test.fun();
        Test t = new Test();
        t.fun2();
    }
    
}
