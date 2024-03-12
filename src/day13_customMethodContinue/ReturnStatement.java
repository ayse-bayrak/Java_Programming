package day13_customMethodContinue;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(25);
        System.out.println("===============================");

        System.out.println("Test1 Started ");
        boolean exit = true;
        if (exit){
            return; // main method gets terminated
            //System.out.println("Hello");// Unreachable statement error,
            // because if is true return and exit the method
        }
        System.out.println(" Test1 Completed ");
        System.out.println(" Test2 Started ");
    }
    public static void eligible(int age){

        if (age< 0 || age >150 ){
            System.out.println("Invalid age: "+age);
            return; //exits the method
            // if the age is invalid, then the this gets terminated

        }

        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1, int n2) {
        int n = n1 * n2;
        return n;// return data
        //System.out.println("Hello");// Unreachable statement error,
        // because if is true return and exit the method
    }
}
