package Inheritance;

class Object{

}
class Test1 extends Object{
    int x,y;
    Test1(){
        super();
        x=100;
        y=200;
    }
    Test1(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Test2 extends Test1{
    int a,b;
    Test2(){
        this(9,99);
        a=300;
        b=400;
    }
    Test2(int a, int b){
        super();
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.disp();
    }
    
}
