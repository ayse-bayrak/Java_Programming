package day10_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "Cydeo";// string literal
        // index:     01234

        char firstChar = str.charAt(0); // 0 to 4
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

      //  char sixthChar = str.charAt(5);// error ==> StringIndexoutOfBoundsException

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("forthChar = " + forthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("==============");
        String sentence = "Java Programming Language";// space also character
        int length = sentence.length();

        System.out.println(length);
        int lastIndex = length -1 ;
        System.out.println(lastIndex);

        System.out.println("==============");

        String s1 = "Wooden Spoon";

        char firstCharacter = s1.charAt(0);
       /* int lastIndexNum = s1.length()-1;
        char lastCharacter = s1.charAt(lastIndexNum);
        */
        char lastCharacter = s1.charAt(s1.length()-1);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        String s2 = "Java is the best programming language";

        char first = s2.charAt(0);

        char last = s2.charAt(s1.length()-1);

        System.out.println("firstCharacter = " + first);
        System.out.println("lastCharacter = " + last);

        System.out.println("--------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1==name2);//false

        System.out.println(name1.equals(name2));// true

        System.out.println("--------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");

        System.out.println( r1 == r2); // true
        System.out.println( r1 == r3); // false
        System.out.println( r2 == r3); // false

        System.out.println( r1.equals(r3));// true
        System.out.println( r2.equals(r3));//true

        System.out.println("--------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt();
        System.out.println("Are you US citizen? yes/no");
        String answer = input.next();

        if (age>= 21 && answer== "yes") // even though I entered yes, it is still that I am not eligible to vote
            // because don't use equal (==) for compareing the string
        {

            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        System.out.println("----------------------------------------");
        if (age>= 21 && answer.equals("yes")) //
        {

            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        input.close();
    }
}
