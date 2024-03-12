package day26_static.CarTask;

import day26_static.CarTask.Car;

public class TestCarObjects {

    public static void main(String[] args) {
        // test the first constructor
        Car car1 = new Car("BMW");

        System.out.println(car1);

        // test the second constructor
        Car car2 = new Car("Audi", "Q4");

        System.out.println(car2);

        // test the third constructor
        Car car3 = new Car("Toyota", "Camry", 2010);

        System.out.println(car3);// third constructor works properly

        // test the fourth constructor
        Car car4 = new Car("Honda", "Accord", 2020, 30000);
        System.out.println(car4);

        // test the fifth constructor
        Car car5 = new Car("Lexus", "RX350", 2019, 40000, "Black");
        System.out.println(car5);
    }
}
