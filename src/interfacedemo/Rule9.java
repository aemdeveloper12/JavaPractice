package interfacedemo;

//Method within an interface is automatically public abstract
interface CalculatorOne{
    void add();
    void sub();
}

class CalculatorTwo{
    public void mul(){
        int a = 20;
        int b= 10;
        int c = a*b;
        System.out.println(c);
    }

    public void div(){
        int a= 20;
        int b= 10;
        int c = a/b;
        System.out.println(c);
    }
}
// Example for - A class can both extend another class as well as implement an interface. 
// However order should be extend first and implemented later
// A variable within an interface is automatically public static final
class MyCalculatorTest extends CalculatorTwo implements CalculatorOne{
    public void add(){
        int a =20;
        int b=10;
        int c = a+b;
        System.out.println(c);
    }

    public void sub(){
        int a =20;
        int b=10;
        int c=a-b;
        System.out.println(c);
    }
}

class Demo{
    public static void main(String[] args) {
        MyCalculatorTest mct = new MyCalculatorTest();
        mct.add();
        mct.sub();
        mct.mul();
        mct.div();
    }
}