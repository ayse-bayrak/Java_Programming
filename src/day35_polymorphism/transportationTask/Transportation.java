package day35_polymorphism.transportationTask;
public abstract class Transportation { // it is a generic, it is not specific thing, so that's why this transportation we should make it abstract
    // because some of the methods how it's done could be different from one object to another
    // in order to be able to store different data we make them as instance
    private final String make, model;  // it is unchangeable
    private final int year;  // it is unchangeable
    private double price;  // price is changeable
    private String color; // color is changeable

    protected Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        setColor(color);
        setPrice(price);
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void transportPeople();
    // abstract keyword is MUST, because it is abstract class
    // it is abstract method,
    // because one method could have multiple different implementation in different subclasses, that's the time that we make the method abstract in parent class
    // what benefit? so that we can complete this parent class easily because we don't have to worry about all those small details

    public abstract void start();
    public void stop() {
        System.out.println("Shut off the engine " + getMake() + " " + getModel());
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
