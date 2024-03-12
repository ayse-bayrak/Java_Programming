package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2EligibleBuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int num1= input.nextInt();
        String result = "invalid";
        if(num1>0){
            if(num1>=21){
              result= "Eligible";
            }else result ="NotEligible";
        }
        System.out.println(result);
    }
}
