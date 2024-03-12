package day32_finalKeyword.carTaskMethodOverriding;

public class BMW extends Car{

    public BMW(String model, int year, String color, double price) {
        super(model, year, color, price);
    }

    public void start() {
        System.out.println("Call the mechanic or jump start "+ getMake() + " " + getModel());
    }
}
/*
Create a class named BMW
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "BMW" and rest of the fields will be set based on the given arguments
					toString(): prints bmw object info when the object is passed in the print statement

 */