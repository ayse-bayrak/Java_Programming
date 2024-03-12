package day14_forLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println("Enter your word that you want to reverse");
        String result = new Scanner(System.in).nextLine();
        result=reverse(result);
        System.out.println(result);
    }

    public static String reverse (String str) {

        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){ // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }
        return reverse;

    }

}
