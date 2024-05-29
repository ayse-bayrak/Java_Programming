package day27_acsessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData;// whenever you don't specify any public, protected or private keywords,
    // therefore teh access modifier of this variable is default this variable

    private static int privateData = 500;
    // only it can be used same class

    public static void publicMethod() {
        System.out.println("public");
    }

    protected static void protectedMethod() {
        System.out.println("protected");
    }

    static void defaultMethod() {
        System.out.println("default");
    }

    private static void privateMethod() {
        System.out.println("private");
    }

    public static void main(String[] args) {
        System.out.println(publicData);// public is accessible everywhere
        System.out.println(protectedData);// protected is accessible within same class
        System.out.println(AccessModifiers.defaultData);//default is accessible within the same class
        System.out.println(privateData);//private is accessible within the same class


        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();

    }



}
