package day26_static;

public class TestIphoneObject {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone("iPhone12", "Black", 1000);

        // if it is instance always call it through the object, I can access any instances

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printIphoneInfo();
/*
Not necessary, anything is static if you need to call it, call through the class, not through the object.
        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();
 */
// static : call through the class

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();

    }




}
