package polymorphismdemo;

//Define a class OS that has a name and size property
class OS{
    private String name;
    private int size;

    //Constructor for OS class that sets the name and size properties
    public OS(String name, int size){
        super();
        this.name = name;
        this.size = size;
    }

    //Getter method for name property
    public String getName(){
        return name;
    }

    //Getter method for size property
    public int getSize(){
        return size;
    }
}

//Define a class Charger that has a brand and voltage property
class Charger{
    private String brand;
    private float voltage;

    //Constructor for Charger class that sets the brand and voltage properties
    public Charger(String brand, float voltage){
        super();
        this.brand = brand;
        this.voltage = voltage;
    }

    //Getter method for brand property
    public String getBrand(){
        return brand;
    }

    //Getter method for voltage property
    public float getVoltage(){
        return voltage;
    }

}

//Define a class Mobile that has an OS and a method that takes a Charger object
class Mobile{
    OS os = new OS("Android", 512);

    // Method that takes a Charger object and prints its brand and voltage properties
    void hasA(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}

//Define a class that demonstrates the use of the other classes
public class AggregationCompositionExample1 {
    public static void main(String[] args){
        //Create a Charger object with brand Samsung and voltage 24.5
        Charger c = new Charger("Samsung", 24.5f);
        
        //Create a Mobile object and print its OS name and size properties
        Mobile m = new Mobile();
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        //Call the hasA method of the Mobile object with the Charger object as an argument
        m.hasA(c);

        // Set the Mobile object to null (deallocate memory)

        m = null;

        // Try to access properties of the Mobile object and call its method, but it will throw a NullPointer 
        //Exception as the object is null

        // System.out.println(m.os.getName());
        // System.out.println(m.os.getSize());
        // m.hasA(c);

        //Print the brand and voltage properties of the Charger object

        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());

    }
    
}
