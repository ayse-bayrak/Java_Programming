package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught");
            e.printStackTrace();
            //System.exit(1);
        }finally {
            System.out.println("Finally block");
        }
        //Even though exception is not handle finally block will gets executed.
        //finally block always will be executed whether you're the exception that you have
        // finally block gets executed even if the try block or catch blocks is already executed.
        //Which means there are at least two blocks
        // adding finally block is optional
    }
}

