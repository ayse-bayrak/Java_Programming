package day14_forLoop;


public class WarmupTask {

    public static void main(String[]args){

        String str3 = combine("one","eight ");
        System.out.println(str3);
        System.out.println(combine("java", "apple"));

        System.out.println("==================task2====================");


        System.out.println(sumOf2Numbers(1,4));
        System.out.println(sumOf3Numbers(1,4,6));
        System.out.println(sumOf4Numbers(1,4,6,7));

    }
    public static String combine(String str1, String str2){

        String result;
        if (str1.endsWith("" + str2.charAt(0))) {// if the first string ends with the first character of the second string

            result = str1+ str2.substring(1);// first character of the second string should be excluded
        }else {
            result = str1 + str2;
        }

        return result;
    }

    public static int sumOf2Numbers (int num1, int num2) {

        int sum = num1 + num2 ;

        return sum;
    }
    public static int sumOf3Numbers (int num1, int num2, int num3) {

        int sum = num1 + num2 +num3 ;

        return sum;
    }

    public static int sumOf4Numbers (int num1, int num2, int num3, int num4) {

        //return num1 + num2 + num3 +num4 ;
        //return sumOf3Numbers(num1,num2,num3)+ num4;
        //return sumOf2Numbers(num1,num2) + sumOf2Numbers(num3, num4);
        return sumOf2Numbers(sumOf3Numbers(num1,num2,num3), num4 );



    }
}
/*
Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight
Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */