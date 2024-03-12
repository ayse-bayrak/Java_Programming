package day15_WhileLoop;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max= Integer.MIN_VALUE;// Any integer number that user enter will ALWAYS be greater than min value
        int min =Integer.MAX_VALUE;// Any integer number that user enter will ALWAYS be less  than max value

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num>max) {
                max = num;
            }

            if (num<min) {
                min =num;
            }

        }
        input.close();
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number

	2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */