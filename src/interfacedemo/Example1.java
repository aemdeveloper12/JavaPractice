package interfacedemo;

import java.util.Scanner;

interface Calculator{
    public void add();
    public void sub();
}

class MyCalculator1 implements Calculator{
    public void add(){
        int a = 200;
        int b = 100;
        System.out.println(a+b);
    }

    public void sub(){
        int a = 200;
        int b =100;
        System.out.println(a-b);
    }
}

class MyCalculator2 implements Calculator{
    public void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println(a+b);
    }

    public void sub(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println(a-b);
    }
}

class MyCalculator3 implements Calculator{
    public void add(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        if(a==0 || b==0){
            System.out.println("Invalid Input");
        }else{
            System.out.println(a+b);
        }
    }

    public void sub(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        if(a==0 || b==0){
            System.out.println("Invalid Input");
        }else{
            System.out.println(a-b);
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        MyCalculator1 mc1 = new MyCalculator1();
        MyCalculator2 mc2 = new MyCalculator2();
        MyCalculator3 mc3 = new MyCalculator3();

        mc1.add();
        mc1.sub();

        mc2.add();
        mc2.sub();
        
        mc3.add();
        mc3.sub();
    }

    
}
