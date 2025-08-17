package Inheritance;

// parent class
class Account{
    int accNum = 1234;
    int pin = 9999;
}

//child class
class Hacker extends Account {
    void disp(){
        System.out.println(accNum);//Inherited Variables
        System.out.println(pin);//Inherited variables
    }

    void changeData(){
        accNum = 6789;//overriding variables
        pin =1010;//overriding variables
    } 
}

class InheritanceExample{
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.disp();
        h.changeData();
        h.disp();
    }
}
