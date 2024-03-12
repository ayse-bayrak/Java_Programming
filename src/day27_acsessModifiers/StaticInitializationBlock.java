package day27_acsessModifiers;

public class StaticInitializationBlock {

    public static int a ;
    public static double b ;
    public static String c ;

    // public static ExcelSheet sheet;
 static {
     a = 100;
     b = 20.5;
     c = "Java";
 }

 /*
 for constructor executed, we need object, and how many object is there, that time gets executed constructor.
 That's why when we do not use constructor for static variable initialization.

 constructor will be used for initialization instance variable
 static block will be used for initialization the static members.

    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/



    /*
    public static void main(String[] args) {

        a = 100;
        b = 20.5;
        c = "Java";

    }
*/


}
