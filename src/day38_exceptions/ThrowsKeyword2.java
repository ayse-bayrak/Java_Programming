package day38_exceptions;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

        //method1(); // since method1 can not handle exception, give me error
        Library.sleep(3.5); // since sleep() method can handle exception, do not give me error
         // method2();// since method1 can not handle exception, give me error

    }

    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }


    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);//InterruptedException

        System.out.println("First program ended");

        new FileInputStream(" ");//FileNotFoundException

        Thread.sleep(5000);

    }
}
/*
   // those are disadvantage of the throws keyword,
        1-Only for checked exception. it can not handle unchaceked exceptions,
        2-throws keyword is not the permanent solution, exception is not gone
 */