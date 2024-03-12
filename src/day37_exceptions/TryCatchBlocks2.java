package day37_exceptions;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};
        try {
            System.out.println(arr[1000]);
        } catch (RuntimeException e) {
            e.printStackTrace(); // strongly recommended to use this printStackTrace method all the time in the catch block
// because it displays full details of the exception after the execution of program

            //System.out.println(e.getMessage());
            //Index 1000 out of bounds for length 4. it only gives you the exception message no line or no other details
            // so it is better to use printStackTrace() instead of getMessage()
        }
        //Index 1000 out of bounds for length 4

        System.out.println("Program1 ended");
        System.out.println("==========================");
        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e) {
           e.printStackTrace();
            //System.out.println(e.getMessage());/// by zero
        }
        // by zero
        System.out.println("program2 ended");
    }
}
