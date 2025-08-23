package abstractiondemo;

abstract class Bird{
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird{
    void fly(){
        System.out.println("Eagle flies at greater heights");
    }
}

class SerpentEagle extends Eagle{
    void eat(){
        System.out.println("serpent eagle hunts over mountains and eats");
    }
}

class GoldenEagle extends Eagle{
    void eat(){
        System.out.println("Golden eagle hunts over mountains and eats");
    }
}
public class Example3 {
    public static void main(String[] args) {
        SerpentEagle se = new SerpentEagle();
        GoldenEagle ge = new GoldenEagle();
        se.eat();
        se.fly();
        ge.eat();
        ge.fly();
    }
    
}
