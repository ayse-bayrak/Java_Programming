package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){ // it has been taken from day18-warmuptask package-Pizza class
        double totalPrice = 0;

        switch (getSize()) {
            case 'S':
            case 's':
                totalPrice += 10 + 2*(getNumberOfCheeseTopping()+getNumberOfPepperoniTopping());
                break;
            case 'M':
            case 'm':
                totalPrice += 12 + 2*(getNumberOfCheeseTopping()+getNumberOfPepperoniTopping());
                break;
            case 'L':
            case 'l':
                totalPrice += 14 + 2*(getNumberOfCheeseTopping()+getNumberOfPepperoniTopping());
                break;
            default:
                System.err.println("invalid entry: " + size );
                break;
        }

        return totalPrice;
    }
    // it has been taken from day18-warmuptask package-Pizza class
    @Override // another call runtime polymorphism
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + getNumberOfCheeseTopping() +
                ", numberOfPepperoniTopping=" + getNumberOfPepperoniTopping() +
                ", totalPrice=" + calcCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)) { // if the specified object is not pizza
            System.err.println("Invalid Object: " + obj);
            System.exit(1);
        }
        Pizza pizza = (Pizza) obj; // if you think down  casting is needed in multiple places for this one object it is
        //you can still assign it back to a variable and reuse this variable instead of continuously downcasting
        // totaly  optional
        if (size == pizza.getSize()) {
            if (numberOfCheeseTopping == pizza.getNumberOfCheeseTopping()) {
                if ( numberOfPepperoniTopping== ((Pizza) obj).getNumberOfPepperoniTopping()) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
warmup tasks:
	1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object
 */