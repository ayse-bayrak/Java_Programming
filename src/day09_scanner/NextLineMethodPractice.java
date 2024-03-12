package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your schoool name");
        String school_name = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();// clear out the scanner
        // we have to give extra nextLine() method if we are using a nextLine() method
        // after the other methods of scanner. After nextLine() method, we don't have to add extra nextLine

        System.out.println("Enter your street name");
        String street_name = input.nextLine();

    }
}
