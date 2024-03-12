package day32_finalKeyword.carTaskMethodOverriding;

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
}
/*

Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()


	2. Create the following sub classes and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

            2. Honda
                    start(): "Press the brake and twist the key to ignition"

            3. Audi
                	start(): "Press the start button"

            4. BMW
                	start(): "Call the mechanic or jump start "

            5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */