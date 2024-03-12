package day16_nestedLoop.warmupTask;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        char ch = 'c';
        int count = 0; //for frequency

        for (int i = 0; i < str.length() ; i++) { // i: index number of str

            if (    ch==str.charAt(i)   ) { // if the character of the string is equal to given character,
                // it means the given character has appeared in the string
                count ++;
            }

        }

        System.out.println("count = " + count);

    }
}
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */