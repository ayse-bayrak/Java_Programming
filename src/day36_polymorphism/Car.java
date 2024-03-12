package day36_polymorphism;

public class Car {


    private String make; // because in order to make sure that object can hide those internal data
    private String model; // because in order to make sure that object can hide those internal data
    private int year; // because in order to make sure that object can hide those internal data
    private String color; // because in order to make sure that object can hide those internal data
    private double price; // because in order to make sure that object can hide those internal data

    public static int numberOfWheels; // because every single car has four wheels,
    public static boolean hasBattery; // because every single car has battery,

    public Car(String model, int year, String color, double price) {
        setMake(getClass().getSimpleName());// setting the class name to the make of the car
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }
    static {
        numberOfWheels = 4;
        hasBattery = true;

    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) { // if specified year is negative or zero
            System.err.println(year + " : invalid year, year can not be zero or negative!");
            System.exit(1); // terminates the program
        } this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { // if specified price is negative or zero
        if (price <= 0) {
            System.err.println(price + " : invalid price, price can not be zero or negative!");
            System.exit(1); // terminates the program
        }
        this.price = price;
    }

    public void start () {
        System.out.println("Press the brake and twist the key to ignition to start" + make + " " + model);
    }

    public String toString() {
        return make+ "{" +
                "model='" + model + '\'' +
                "year=" + year +
                "color='" + color + '\'' +
                "price=" + price +
                "number of wheels='" + numberOfWheels + '\'' +
                "hasBattery=" + hasBattery +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            System.err.println("Invalid Object");
            System.exit(1);
        }

        if (model.equals(((Car) obj).model)) {
            if (color.equals(((Car) obj).color)) {
                if (year == ((Car) obj).year) {
          return true;
                }
            }
        }
        return false;
    }
}
