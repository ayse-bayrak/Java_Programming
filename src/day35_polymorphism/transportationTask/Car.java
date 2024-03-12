package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation{

    protected Car(String make, String model, String color, int year, double price ) {
        super(make, model, color, year,  price);
    }

    public void drive() {
        System.out.println( getMake() + " " + getModel() + " is driving");
    }
}
