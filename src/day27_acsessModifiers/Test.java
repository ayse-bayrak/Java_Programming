package day27_acsessModifiers;

public class Test {
    public static void main(String[] args) {
// as soon as you call the class, first time static block gets executed

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("==================================");

        //Accsess modeifier Test

        System.out.println(AccessModifiers.publicData);// public is accessible within same package
        System.out.println(AccessModifiers.protectedData);// protected is accessible within the same package
        System.out.println(AccessModifiers.defaultData);//default is accessible within the same package
       //System.out.println(privateData);//private is NOT accessible within the same package, ONLY accessible same class

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();

    }
}
