package day19_ArrayIntro.practiceTask;

import java.util.Arrays;
import java.util.Scanner;

public class ItemNamePrice {
    public static void main(String[] args) {
        String[] items = new String[5];
        double[] prices = new double[5];
        double totalPrice = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 5 items name and price ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter "+(i+1)+". item name and price");
            items[i] = input.nextLine();
            prices[i] = input.nextDouble();
            input.nextLine();
            totalPrice += prices[i];

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(items[i] + "'s price is " + prices[i] );
        }

    }
}
/*
Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines
 */