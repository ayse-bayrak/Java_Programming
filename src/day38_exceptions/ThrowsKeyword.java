package day38_exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        /*
        System.out.println("Program1 started");

       // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------");

        System.out.println("Program2 started");

        // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program2 ended");
        */

        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");


        System.out.println("--------------------------------------");

        System.out.println("Program3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(5000);

        System.out.println("Program3 ended");
        // those are advantage of the throws keyword,
        // it is faster, it is shorter, less code, it is much more readable
    }
}
/*
-if the exception you have is unchecked exception, there is ONLY ONE way,
try catch is the only way that can handle the unchecked exception
-if the exception you have is checked exception, there are two ways to handle it.
First way is to handle it properly or you can handel it temporarily

Advantage of handling it properly is you will not get that exception ever again.
Advantage of handling it temporarily is the fastest and shortest way to handle it.
 */