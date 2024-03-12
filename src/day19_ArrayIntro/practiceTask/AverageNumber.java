package day19_ArrayIntro.practiceTask;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int size = input.nextInt();
        int sum = 0;
        int[] numbers = new int [size];
        for (int i = 0; i < size; i++) {

            System.out.println("Enter "+ (i+1)+". number");
            numbers[i]= input.nextInt();
            sum +=numbers[i];
        }
        double average = sum/(double)size; // apply to casting one of them

        DecimalFormat df = new DecimalFormat("0.00");// i want to 2 numbers for decimal

        System.out.println(Arrays.toString(numbers));
        System.out.println("average = " + df.format(average));


    input.close();
    }
}
/*
AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number

 */