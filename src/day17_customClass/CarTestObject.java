package day17_customClass;

public class CarTestObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("My car", "Toyota", "Avensis", 13, "grey", 500000);

        Car car2 = new Car();
        car2.setInfo("My next car", "Mercedes", "GLA200", 0, "red", 3000000);

        System.out.println(car1);
        System.out.println(car2);

        car2.CarInfo();
    }
}
