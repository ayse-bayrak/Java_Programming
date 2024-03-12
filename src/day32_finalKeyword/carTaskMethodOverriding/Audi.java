package day32_finalKeyword.carTaskMethodOverriding;

public class Audi extends Car{

    public Audi(String model, int year, String color, double price) {
        super(model, year, color, price);
    }

    public void start() {
        System.out.println("Press the start botton to start to " + getMake() + " " + getModel());
    }
}
/*
start(): "Press the start button"
 */