package polymorphismdemo;

class Heart{
    private int weight;
    private int bpm;

    Heart(int weight, int bpm){
        this.weight = weight;
        this.bpm = bpm;
    }

    int getWeight(){
        return weight;
    }

    int getBpm(){
        return bpm;
    }
}

class Brain{
    private int weight;
    private String colour;

    Brain(int weight, String colour){
        this.weight = weight;
        this.colour = colour;
    }

    int getWeight(){
        return weight;
    }

    String getColour(){
        return colour;
    }
}

class Bike{
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage){
        this.brand = brand;
        this.mileage = mileage;
    }

    String getBrand(){
        return brand;
    }

    int getMileage(){
        return mileage;
    }
}

class Book{
    private String name;
    private String author;

    Book(){

    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    String getName(){
        return name;
    }

    String getAuthor(){
        return author;
    }
}

class Student{
    Heart h = new Heart(289, 72);
    Brain b = new Brain(1400, "Grey");

    void hasA(Book book){
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }

    void hasA(Bike bike){
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());
    }
}
public class AggregationCompositionExample2 {
    public static void main(String[] args){
        Student s = new Student();
        Bike bike = new Bike("Duke", 35);
        Book book = new Book("Java","JG");
        System.out.println(s.h.getWeight());
        System.out.println(s.h.getBpm());
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getColour());
        s.hasA(bike);
        s.hasA(book);

        /* s = null;

        System.out.println(s.h.getWeight());
        System.out.println(s.h.getBpm());
        System.out.println(s.b.getWeight());
        System.out.println(s.b.getColour());
        s.hasA(bike);
        s.hasA(book); */
        System.out.println("After Deallocation student memory still we can access aggregation loosely bound bike and book values");
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
    
}
