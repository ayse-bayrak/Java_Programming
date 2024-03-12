package day11_string;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "CYDEO SCHOOL";
        str1.toLowerCase();
        System.out.println(str1);// CYDEO SCHOOL, because string is immutable

        str1 = str1.toLowerCase();
        System.out.println(str1);// cydeo school, because we do reassignment

        System.out.println("=====================================");
        String str2 = "java programming";//by using string literal
        //once the string is created it is always and forever immutable,
        // means you won't be able to change.
        str2.toUpperCase();
        System.out.println(str2); // still original value "java programming"
        str2 = str2.toUpperCase(); // "JAVA PROGRAMMING" reassigned

        System.out.println("=====================================");
        String word = "Wooden Spoon";
        word.toUpperCase(); // "WOODEN SPOON" new string will be created and you have a new string which is all uppercase.
        word.toLowerCase(); // "wooden spoon" new string will be created and you have a new string which is all uppercase.

        System.out.println(word); // original one
        //STRING IMMUTABLE

        word = word.toUpperCase();
        System.out.println(word);//WOODEN SPOON
        word = word.toLowerCase();
        System.out.println(word); //wooden spoon
        System.out.println("=====================================");
        //trim(); white spaces which are not used
        String str4 = "         Cydeo School"; // white spaces, we are not using them for anything
        str4 = str4.trim(); // assigned back to the variable str4
        System.out.println(str4);// "Cydeo School" excluding any white spaces

        System.out.println("=====================================");

        String sentence1 = "Today is Sunday, and we have java Class";
       int indexNumber = sentence1.indexOf('w' ); // first matching character it returns to index number
        // it will be return as an integer
        System.out.println(indexNumber);

        String s1 = "I love Java Programming";
        int firstA = s1.indexOf('a'); // first matching one
        System.out.println(firstA);//8
        int secondA = s1.indexOf("a ");
        System.out.println(secondA); // 10

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');// with character symbol it find first matching character
        System.out.println(a1);//1
        int a2 = s2.indexOf("a Python");//3
        int a3 = s2.indexOf("avaS"); // first matching
        System.out.println(a3);//13
        int a4 = s2.indexOf("aS");//15

        // lastIndexOf=====================
        String w = "Java";

        System.out.println(w.lastIndexOf('a'));//last matching I think returns 3
        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('n'));


    }
}
