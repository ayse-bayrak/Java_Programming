package day22_wrapper_class_array_list;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1);//201

        //  Integer num1 = Integer.parseInt(str); // unboxing

        int num = Integer.parseInt(str); // parse method converts String to Primitive Value

        //parse method like this:
        // Datatype.parseDataType(shortly)(String);

        System.out.println(num + 1);//21

        Integer num2 = Integer.valueOf(str);// valueOf method converts String to Wrapper Class
        //valueOf method like this:
        // Datatype.(String);

        System.out.println(num2);//20

        System.out.println("------------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);  // Wrapper class

        System.out.println(num3);//20.5
        System.out.println(num4);//20.5

        System.out.println("------------------------------------------");

        String x = "false";

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);//false
        System.out.println(r2);//false

        System.out.println("------------------------------------------");
        char ch1 = '1';
        char ch2 = 'S';
        char ch3 = 'l';
        char ch4 = 'A';
        char ch5 = '$';

        boolean isDigit =Character.isDigit(ch1);//true

        boolean isLetter = Character.isLetter(ch2);//true

        boolean isLowerCaseLetter = Character.isLowerCase(ch3);//true

        boolean isUpperCaseLetter = Character.isUpperCase(ch4);//true

        boolean isSpecialChar = !Character.isLetterOrDigit(ch5); // special character // true

        System.out.println("------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println("sum = " + sum); // 1+2+3+4+5 = 15

        //The task that Muhtar's said

        String word  = "mn@#123Ab!";
        String digit ="";
        String letters ="";
        String special ="";

        for (char each : word.toCharArray()) {

            if (Character.isDigit(each)) {
                digit += ""+ each;
            }
            else if (Character.isLetter(each)) {
                letters += ""+ each;
            } else {
                special += ""+ each;
            }

        }
        System.out.println("special = " + special); // @#!
        System.out.println("letters = " + letters);// mnAb
        System.out.println("digit = " + digit); // 123

    }

}
/*
write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */