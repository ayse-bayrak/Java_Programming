package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");
        Car car = null;
        // we have the Car reference at reference variable but we don not have abject,
        // if we do not have car object. you can not call the instance methods drive(),
        // which means this line may give me some exception

        // there is disadvantage placing the parent class exception in the catch block.
        // during the runtime every single subclass will be checked before handling this exception.
        // so usually it is the best, if you just specify the specific exception type  class when in the catch block
        // if there are any other possible exception, that might be through, during runtime, I can choose to specify
        // all of them by using multiple catch block

        try{
            car.drive();  // NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e) {
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e) { // final solution, it should be handled any catch
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        //only one block gets executed, top to bottom, whichever catch the exception first
        // that's the block gets executed and remaining catch blocks does not get executed.

        System.out.println("Program1 endeed");
        /*
        Program1 started
        Third Catch Block
        Program1 endeed
         */

        System.out.println("============================================");
        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // shortcut, IDEA shows us shortcut try catch to handle
        System.out.println("Program3 ended");
    }


}
