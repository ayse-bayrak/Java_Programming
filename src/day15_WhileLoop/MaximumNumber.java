package day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;//-2147483648


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if( num > max){ // if the user entered entry is greater than the current maximum number that we have
                max = num; // then user entered number should be the maximum number
            }

        }

        System.out.println("max = " + max);
        input.close();

    }
}
/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */