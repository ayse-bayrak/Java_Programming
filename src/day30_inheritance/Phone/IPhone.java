package day30_inheritance.Phone;

public class IPhone extends Phone{ // Iphone IS A Phone , is relationship

    public IPhone(String model, String size, String color, double price) {
        super(model, size, color, price);
    }

    public static boolean hasApplePay = true;

     // faceTime overloading
    public void faceTime(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println( getBrand() + " " + getModel() + " is face timing with " + email );

    }

}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
						*/