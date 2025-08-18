package staticdemo;

import java.util.Scanner;

class Businessman1{
    private float si;
    private float p;
    private float t;
    static private float r;

    static{
        r= 15.2f;
    }

    public void acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = scan.nextFloat();
        System.out.println("Enter the tenure");
        t = scan.nextFloat();
    }

    public void calcInterest(){
        si = (p*t*r)/100;
    }

    public void disp(){
        System.out.println(si);
    }
}
public class Example3 {
    public static void main(String[] args) {
        Businessman1 b1 = new Businessman1();
        b1.acceptInput();
        b1.calcInterest();
        b1.disp();
        Businessman1 b2 = new Businessman1();
        b2.acceptInput();
        b2.calcInterest();
        b2.disp();
        Businessman1 b3 = new Businessman1();
        b3.acceptInput();
        b3.calcInterest();
        b3.disp();
    }
    
}
