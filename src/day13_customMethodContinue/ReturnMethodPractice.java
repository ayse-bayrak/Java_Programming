package day13_customMethodContinue;

public class ReturnMethodPractice {
    public static void main(String[] args)  {

        System.out.println(isOdd(23));
        int num =200;
        if (isEven(num)){
            System.out.println(num + "is even number");
        }else {
            System.out.println(num + " is not even number");
        }

        System.out.println("=====================================");

    }

    public static boolean isOdd(int num){

        //return (num%2 != 0)?true:false; //other approach
        if (num%2 !=0){
            return true;
        }
        return false;
    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static double maxNum(double num1, double num2) {
        return (num1 > num2)?num1:num2;

    }

    public static double minNum(double num1, double num2) {
        return  (num1 < num2)?num1:num2;


    }
}



/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */
