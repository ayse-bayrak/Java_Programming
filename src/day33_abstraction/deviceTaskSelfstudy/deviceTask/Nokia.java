package day33_abstraction.deviceTaskSelfstudy.deviceTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long number) {
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + getModel()+ " calling to "+ number);
    }

    @Override
    public void text(long number) {
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + getModel()+ " texting to "+ number);
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + getModel()+ " turning on ");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + getModel()+ " turning off ");
    }
}
