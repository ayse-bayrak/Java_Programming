package day18_javaMemoryAllocation;

import day17_customClass.Dog;

import java.sql.SQLOutput;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";

        System.out.println(s1);//Java

        //There are two ways make this object to be eligible
        // 1- one way
        s1 = null; // "Java" will be eligible for garbage collection
        // null means it does not refer to any objects at all
        System.out.println(s1);//java

        //System.out.println(s1.toUpperCase());

        // it will be getting exception called NullPointerException.
        // Because there has been no object

        //System.out.println(s1.replace(null, "Python"));

        //this replace method is an instance method. In order to call any instance method
        // or any instance variable of an object, first we have to object in this reference name.
        // but we don't have to this seneario. we weill getting NullPointerException
        // no instance methods can be called through something that is no

        //What is the difference empty string and null keyword?
        String a =""; // this is an object, those one is exist.
        String b = null; // this is not an object, it does not exist

        System.out.println("===============================");
        // 2 - another way
    String str1 = "Pyhton"; //"Pyhton" is redundant means is no longer object after 36 line
        // it will be eligible for the garbage collection and it will be collected garbage collector.
    //    stack     heap
        str1 = "CYDEO";

        System.out.println(str1);

        System.out.println("============================");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        //dog1 = null; //OR
        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);




    }
}
