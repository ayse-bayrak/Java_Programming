package day15_WhileLoop;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        String str = "xxxxxxxzzzzyyyyyyyyxxxxxzzzzzz";

        String result = "";   //"efr"

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (result.contains(a + "")) continue; //if the character is already contained in new string
            result += a;// skip it
        }

        System.out.println(result);
    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */
