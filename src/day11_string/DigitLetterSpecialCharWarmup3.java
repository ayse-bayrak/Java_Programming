package day11_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DigitLetterSpecialCharWarmup3 {
    public static void main(String[] args) {
        /*String str = "";
        System.out.println(str.length());//gives us 0, not index, string is empty
        System.out.println("".charAt(0)); // error "StringIndexOutOfBoundsException"
        */

        System.out.println("Enter your word");
        String str = new Scanner(System.in).nextLine(); // This scanner objeect is being used one time,
        // will not be use anymore, you don't even need to give the close method.
        // because one referenced, means are not reusable object will be cleared from the memory,
        // this process is garbage collection which you will learn in the future


        if(str.length()>=1) {
            char f = str.charAt(0);

            if(f >='0' && f <= '9') {
                System.out.println("first character is Digit");
            }else if (f >= 'A'&& f<= 'Z'){
                System.out.println("first character is Uppercase");
            }else if(f >= 'a' && f <= 'z') {
                System.out.println("first character is Lowercase");
            }else {
                System.out.println("first character is Special Character");
            }
        } else {
            System.out.println("String is empty");
        }

    }
}
