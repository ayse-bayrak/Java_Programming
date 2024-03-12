package day21_multi_dimensional_array.warmupTask;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";
        //for extra spaces for at the begining or at the end of string,
        // we can remove them by using trim method

        str  = str.trim();
        System.out.println(str);//Hello world      I      love      Java
        // we need to remove those extra spaces that we have between words

        String[] str1 = str.split(" ");

        System.out.println(Arrays.toString(str1));
        //[Hello, world, , , , , , I, , , , , , love, , , , , , Java]

        str = "";
        for (String each : str1) {
            if(!each.isEmpty()) {
                str += each +" ";
            }
        }

        str = str.trim();// to remove the last space Now, we don't have any more extra spaces

        System.out.print(str);
    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */