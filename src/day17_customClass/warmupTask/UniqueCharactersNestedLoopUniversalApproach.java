package day17_customClass.warmupTask;

public class UniqueCharactersNestedLoopUniversalApproach {
    public static void main(String[] args) {
         String str = "aabcccd";
         String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {//cheks how many times the ch has appeared in str
                if (str.charAt(j)==ch ) {// if the ch has appeared in the string
                    frequency++;// inrease the frequency by 1
                }

                if (frequency==1) {  // if the frequency is one, then it's unique
                    unique += ch;
                }

            }
        }


        System.out.println(unique);
    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */