package day32_finalKeyword.carTaskMethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {

    public Tesla(String model, int year, String color, double price) {
        super(model, year, color, price);
    }

    public void start() {
        System.out.println("Say \"Start\" to start " + getModel() + " " + getMake());
    }

    public final void autoPilot() {
        System.out.println(getMake() + " " + getModel() + " is in self driving mode");
    }

    @Override
    public void setModel(String model) {

        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", "Model 3"));

        if (!models.contains(model)) { // if specified model is not valid model
            System.err.println("Invalid Tesla Model: " + model);
            System.exit(1);
        }

        super.setModel(model); // this.model = model;
    }

    public void setColor(String color) {

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if (!colors.contains(color)) {
            System.err.println("Invalid Tesla Color: " + color);
            System.exit(1);
        }

        super.setColor(color); // this.color = color;
    }

    @Override
    public void setYear(int year) {
        if (year < 2008) {
            throw new RuntimeException(year + " invalid");
        }
        super.setYear(year);

    }

    @Override
    public void setPrice(double price) {
        if (price < 50000) {
            throw new RuntimeException(price + " invalid");
        }
        super.setPrice(price);


    }
}
/*
Create a class named Volvo
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Volvo" and rest of the fields will be set based on the given arguments
					toString(): prints volvo object info when the object is passed in the print statement
 */