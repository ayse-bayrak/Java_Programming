package day15_WhileLoop;

public class RemoveDuplicatesMine {
    public static void main(String[] args) {

        String str = "abbbcccc";

        for (int i = 0; i < str.length() ; i++) {

           if (str.replaceFirst(str.charAt(i)+""," " ).contains(str.charAt(i)+"") ) {
               str = str.replaceFirst(str.charAt(i)+""," " );
           }

        }
        str=str.replace(" ","");
        System.out.println(str);

    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */
