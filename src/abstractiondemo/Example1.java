package abstractiondemo;

abstract class Plane{
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane{
    void takeOff(){
        System.out.println("Plane is takeoff");
    }

    void fly(){
        System.out.println("CargoPlane is " + "flying at low height");
    }

    void land(){
        System.out.println("Plane is landing");
    }
}

class PassengerPlane extends Plane{
    void takeOff(){
        System.out.println("Plane is takeoff");
    }

    void fly(){
        System.out.println("PassengerPlane is " + "flying at medium height");
    }

    void land(){
        System.out.println("Plane is landing");
    }
}

class FighterPlane extends Plane{
    void takeOff(){
        System.out.println("Plane is takeoff");
    }

    void fly(){
        System.out.println("FighterPlane is " + "flying at great height");
    }

    void land(){
        System.out.println("Plane is landing");
    }
}
public class Example1 {
    public static void main (String[] args){
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();
        cp.fly();
        cp.land();

        pp.takeOff();
        pp.fly();
        pp.land();

        fp.takeOff();
        fp.fly();
        fp.land();
    }
    
}
