package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        //Data Type Variable=Data
        // byte a= "Java"; ==> compile error // byte ONLY accepts integer values (-128~127)
        // byte a=20.5; //byte can not take decimal number, can take integer number
        //byte a=2000; // out of Byte' range
        byte a=20;
        // price of the car is $17500

        short p=17500; // (-32,768~32,767)
        System.out.println("p");// you don't call it by passing it in the double quote
        System.out.println(p);// How we can call the variable

        //slary is $95000
        int s=95000; // preferred
        System.out.println(s);// call the variable

        //int n=9999999999;// compile error,becausa out of int's range
        long n=9999999999l;// use l or L to not compile error and force as a long variable
        // gpa is 3.5

        double gpa=3.5; // preferred data type all the decimals
        float gpa2=3.5f;// use f or F to force not compile error
    }
}
