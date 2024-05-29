package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program1 started");
        try {

            System.out.println(9 / 0); // it is give me exception, ArithmeticException: / by zero
            System.out.println("Try block");
        } catch (ArithmeticException e) {  // we have to give the right exception class, there is MUST is a relationship for ex. it can not be null pointer etc
            System.out.println("Catch block");
        }
        System.out.println("Program1 ended");

        /*
        Program1 started
        Catch block
        Program1 ended
         */


        System.out.println("=============================");
        System.out.println("Program2 started");

        String str = null;
        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");
        }catch (RuntimeException  e) { // it can be Throwable or Exception, but it is better to use RuntimeException,
            // because it only dedicated unexpected exception
            System.out.println("Catch Block");
        }
        System.out.println("Program2 ended");

        /*
        Program2 started
        Catch Block
        Program2 ended
         */
        System.out.println("==========================");
        System.out.println("Program3 started");
        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        }catch (InterruptedException e) {
            System.out.println("Catch Block");  // The only time to catch block gets executed this
            // if try block can not handle this exception, but the catch block can catch it, in here
            // try block can handle executed
        }

        // only one of those gets executed.. try block or catch block
        // you don't have to memorize them at all, try block can handle or catch block can handle.
        // you just place the try catch block together and make sure that you use the right exception type in the catch block
        System.out.println("Program3 ended");
        /*
        Program3 started
        Try Block   // Try block can handle this exception
        Program3 ended
         */

    }
}
