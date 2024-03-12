package day33_abstraction.deviceTaskSelfstudy.deviceTask;

public class IPhone extends Phone {
    public IPhone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long number) {
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + getModel()+ " is calling to "+ number);
    }

    @Override
    public void text(long number) {
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + getModel()+ " is texting to "+ number);
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
/*
Create the following sub-classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia

 */