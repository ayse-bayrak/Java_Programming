package day36_polymorphism;

import org.w3c.dom.ls.LSOutput;

public class TestEqualMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); //false, different object, different allocation
        //System.out.println(circle1.equals("Java"));// invalid object because "Java" object is not Circle object.
        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1.equals(circle3)); // false

        IPhone iPhone1 = new IPhone("Apple", "12", " Medium", "Black", 900);
        IPhone iPhone2 = new IPhone("Apple", "12", " Medium", "Blue", 900);
        IPhone iPhone3 = new IPhone("Apple", "12", " Medium", "Black", 900);


        //System.out.println(iPhone1.equals(circle1)); // Invalid object, Object must be Iphone

        System.out.println(iPhone1.equals(iPhone2)); // false
        System.out.println(iPhone1.equals(iPhone3)); // true

    }

}

