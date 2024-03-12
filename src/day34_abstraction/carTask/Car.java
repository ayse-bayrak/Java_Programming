package day34_abstraction.carTask;

public abstract class Car { // meant to be inherited, can not be instantiated

    private final String make, model;
    private String color; // color is changeable, so it is not final
    private final int year; // same car object's year should be unchangeable
    private double price;  // it is going to change, so it is not final

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the car
        this.model = model;
        this.year = year;
        setColor(color);
        if (getYear()<= 1886) {
            throw new RuntimeException("invalid price: " + price + "\n price can not be less than 1886");
        }
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0) {
            throw new RuntimeException("invalid price : " + price + "\n can not be less than negative or zero");
        }
        this.price = price;
    }

    protected final void stop() { // to make sure that non-sub classes outside the package can not access it
        System.out.println("Presse the brake to stop " + make + " " + model);
    }

    protected abstract void start();// meant to be overridden, and it's only visible in subclass.

    public String toString() {
        return  make + "{" + // make already set as getClass.simpleGetName in the constructor

                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()
 */