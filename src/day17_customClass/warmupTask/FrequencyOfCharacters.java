package day17_customClass.warmupTask;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
       String  str = "aabcccd";
       String result = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j)==ch) {
                    count ++;
                }

            }

            if(result.contains(ch+"")) {//if the character is already included in the result
                continue;// skip that character
            }

            result += ch + "" + count;

//            if (  !(result.contains(ch+""))  ) {
//                result +=ch;
//                result +=count;
//            }

        }

        System.out.println(result);
    }
}
/*
 2. Write a program that can find the frequency of the characters from a string

        Ex:
        str = "aabcccd";

        output:
        a2b1c3d1
 */