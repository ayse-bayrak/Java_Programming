package day11_string;

import java.util.Scanner;

public class LongestStringWarmupTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
       // int length_str1 = str1.length();
        //int length_str2 = str2.length();
        scan.close();
        if(str1.length()>str2.length()){
            System.out.println("Longest string is "+ str1);
        } else if (str2.length()>str1.length()) {
            System.out.println("Longest string is "+ str2);
        }else {
            System.out.println("Equal ");
        }
    }
}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			if both have the same number of characters then print "Equal"
 */