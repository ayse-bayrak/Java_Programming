package day12_customMethods;

import java.util.Scanner;

public class FormatFullNaim {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Name ve Last Name ");
        String first= input.nextLine().trim().replace(" ", "");
        String last = input.nextLine().trim().replace(" ", "");
        input.close();
        first  = first.toUpperCase().charAt(0) + first.toLowerCase().substring(1);

    }
}
/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */