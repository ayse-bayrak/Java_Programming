package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        String str = "Java";

        //char ch = str.charAt(1250); // unchecked exceptions
       // System.out.println(ch); //StringIndexOutOfBoundsException

        Pizza pizza = null; // null keyword is not object, your object is null, null does not reference to any object at all

        //pizza.calcCost();//NullPointerException, unchecked exception category

        //System.out.println(50/0); // ArithmeticException, unchecked exception category

        System.out.println("Hello World");

        System.out.println("=========================================");
        // bug looks like this, for example different between bug and error
        int score = 100;
        if (score>59) {
            System.out.println("Your grade is D");
        }else if (score>70) {
            System.out.println("Your grdae is C");
        }
        //There is a bug
        System.out.println("====================================");

        //FileInputStream file = new FileInputStream(""); // Checked Exception
       //Thread.sleep(3000); // Checked exception


    }
}
