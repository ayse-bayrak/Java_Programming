package day17_customClass.warmupTask;

public class UniqueCharacters1LastIndexFirstIndex {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";
        for (int i = 0; i <str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each)==str.lastIndexOf(each)) {
                unique +=each;
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