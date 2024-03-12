package utilities;
//import day27_accessModifiers.AccessModifiers;
import day27_acsessModifiers.Data;
import day27_acsessModifiers.AccessModifiers;
import day31_inheritance.ProtectedAccessModifier;

public class Test { //to visible o and methodA(), Test MUST extends ProtectedAccessModifier


    //Test class is under different package, we couldn't access Data Class

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("---------------------------");

        //System.out.println(AccessModifiers.publicData); // public is always accessible in different packages

        //  System.out.println(AccessModifiers.protectedData); // protected is NOT always accessible in different packages

        //   System.out.println(AccessModifiers.defaultData); // default is not be accessible in different packages

        //    System.out.println(AccessModifiers.privateData); // private is not accessible in different packages

        //new AccessModifiers();


        //AccessModifiers.publicMethod();
        //    AccessModifiers.protectedMethod();
        //    AccessModifiers.defaultMethod();
        //    AccessModifiers.privateMethod();

        System.out.println(AccessModifiers.publicData);// public is always accessible within different package, outside the packagae
        //System.out.println(AccessModifiers.protectedData);// protected is NOT always (there is one chance) accessible within different package, outside the packagae
        //System.out.println(AccessModifiers.defaultDate); // default is NEVER BE accessible within different package, outside the packagae
        //System.out.println(privateData);//private is NOT accessible within the different package, ONLY accessible same class

        new AccessModifiers();


        AccessModifiers.publicMethod();
        //    AccessModifiers.protectedMethod();
        //    AccessModifiers.defaultMethod();
        //    AccessModifiers.privateMethod();

        /*
        protected Access Modifier visible subClass, we need Test extends ProtectedAccessModifier,
        and then o and method A could be visible

      System.out.println(o);
        ProtectedAccessModifier.methodA();

        */
    }
}
