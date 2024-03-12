package day33_abstraction.deviceTaskSelfstudy.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public abstract void call(long number);
    public abstract void text(long number);
}
/*
1. Phone
				Extra methods:
					call(), text()
 */