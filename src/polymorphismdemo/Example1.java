package polymorphismdemo;
class Plane{
    void takeOff(){
        System.out.println("Plane is takeoff");
    }
    void fly(){
        System.out.println("Plane is flying");
    }

    void land(){
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("CargoPlane is "+ "flying at low heigts");
    }

    void carryCargo(){
        System.out.println("CargoPlane is carrying cargo");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("PassengerPlane is "+ "flying at medium height");
    }

    void carryPassenger(){
        System.out.println("PassengerPlane is carrying passengers");
    }
}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("FighterPlane is "+ "flying at greater height");
    }

    void carryWeapons(){
        System.out.println("FighterPlane is carrying weapons");
    }
}

class Airpot{
    void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
class Demo{
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        /*cp.fly();
        pp.fly();
        fp.fly();*/
        
        /*Plane ref;
        ref = cp;
        ref.fly();
        ((CargoPlane)ref).carryCargo();

        ref=pp;
        ref.fly();
        ((PassengerPlane)ref).carryPassenger();

        ref = fp;
        ref.fly();
        ((FighterPlane)ref).carryWeapons();*/

        Airpot a = new Airpot();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);
    }
}