package interfacedemo;


interface Calculator1{
    public void add();
    public void sub();
}

interface Calculator2{
    public void mul();
    public void div();
}

// Example for - A class can implement multiple interfaces because diamond shape problem doesn't exis as
// interfaces will not have parents
class MyCalculator implements Calculator1, Calculator2{
    public void add(){
        int a =20;
        int b =10;
        int c = a+b;
        System.out.println(c);
    }

    public void sub(){
        int a = 200;
        int b = 100;
        int c = a-b;
        System.out.println(c);
    }

    public void mul(){
        int a = 20;
        int b =10;
        int c = a*b;
        System.out.println(c);
    }

    public void div(){
        int a = 20;
        int b =10;
        int c = a/b;
        System.out.println(c);
    }
}

class Rule6 {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        
        System.out.print("Addition: ");
        calc.add();  // 30
        
        System.out.print("Subtraction: ");
        calc.sub();  // 100
        
        System.out.print("Multiplication: ");
        calc.mul();  // 200
        
        System.out.print("Division: ");
        calc.div();  // 2
    }
}
