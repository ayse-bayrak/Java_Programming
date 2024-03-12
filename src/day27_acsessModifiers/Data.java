package day27_acsessModifiers;

public class Data {

    // this class's members are three instance variables three static variables,
    // two instance methods, two static methods
    // suppose that some of the members in this class, you need to use it in the other classes,
    // in the other packages or other classes

    public int a, b, c; // three instance variables
    public static int d, e, f; // three static variables

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public static void method3() {
        System.out.println("Method 3");
    }

    public static void method4() {
        System.out.println("Method 4");
    }

}
