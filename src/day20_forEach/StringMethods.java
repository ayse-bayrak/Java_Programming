package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // toCharArray() method
        String str = "Cydeo School";
        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));//[C, y, d, e, o, S, c, h, o, o, l]

        System.out.println("=======================================");

        //split() method

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));//[Today, is, a, great, day, to, learn, java]

        String[] words1 = str2.split("great");//
        // great is not included because we used it for splitting. It is the splitting point in the string.

        System.out.println(Arrays.toString(words1)); // [Today is a, day to learn java]

        String[] words2 = str2.split("Pyhton");
        System.out.println(Arrays.toString(words2));//[Today is a great day to learn java] I have only one element, because I did not split it all

        System.out.println("=====================================================================");

        String sentence = "I love Java";
        // "Java love I"

        sentence.split(" ");  // [I, love, java]

        String[] arr = ArraysUtility.reverse(sentence.split(" ")); //[Java, love, I]
        System.out.println(Arrays.toString(arr)); // [I, love, java]

        String reversedSentence = "" ; // for write reverse sentence as a String

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }

        System.out.println(reversedSentence); //"Java love I"
        }
}
