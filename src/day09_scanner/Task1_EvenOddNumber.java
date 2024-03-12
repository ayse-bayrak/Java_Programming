package day09_scanner;

import java.util.Scanner;

public class Task1_EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        String result="";
        if(num1>0 ){
        if(num1%2==0){
            result="Even";
        } else result= "Odd";

        } else result= "invalid";
        System.out.println(result);
    }
}
