package day26_static;

public class Iphone {

    public static String brand = "Apple";// static: "Apple" is the brand of all the iphone objects
    public String model; // why? different models for iphone objects

    public String color; // different color for iphone objects
    public double price; // different price is needed for iphone objects
    public static String OS = "iOS"; // static: operating system is same for all the iphone objects
    public static String madeIn = "China"; // static: madeIn is same for all the iphone objects

    public static boolean hasBattery = true; // only one value

    public static boolean isTouchScreen = true; // only one value
    public static boolean isExpensive = true; // only one value

    // for initialize instance variable, use Constructor
    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //    public static void printPhoneInfo() {// ERROR only accept static variable
//        System.out.println(model);
//        System.out.println(color);
//    }

    public void printIphoneInfo(){// instance methods accepts both static and none static
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
    }

    public static void printOperatingSystem() {
        System.out.println("OS = " + OS);
    }
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensive
if all the objects from same Class needs same value, it is static, otherwise instance

brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensive
 */