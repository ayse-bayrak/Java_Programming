package day11_string;

public class StringMethod2 {
    public static void main(String[] args) {
        //replace() method

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
//        sentence.replace("Phyton", "Java");
//        System.out.println(sentence);/* original value */

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        String word = "Java";
        System.out.println(word.replace('a', 'e'));


        //---------------------------------------
        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2);

        //second or other replace ---------------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        System.out.println(sentence3);
        //substring()  method  ---------------------------------------
        //substring(beginningIndex , endingIndex)
        String sentence4 = "I love Java Programming";
        //       index      012345678910
        String languageName= sentence4.substring(7,10+1 );// 10 + 1 because exclude lastIndex

        System.out.println(languageName);//java
        String sentence5 = "Today is Sunday, tomorrow is Monday";
        //       index      0123456789.........................
        String today = sentence5.substring(9,14+1 );// 14 + 1 because exclude lastIndex
        System.out.println(today);
        //------------------------------------------------
        String email = "CydeoSchooljavaPrigramming@gmail.com";
        //how do we find domain name? it is yahoo in this example, after @ character is begin domain name
        int beginnig = email.indexOf('@')+ 1;
        //the last character of the domain of the email is always places before dot (.)
        int ending = email.lastIndexOf('.');// it doesn't need +1
        // because substring method inclued till ending character
        String domain =email.substring(beginnig, ending);
        System.out.println(domain);
        String sentence6 = "I love Java Programming";
        //String r1 = sentence6.substring(7, sentence6.length());// it doesn't nesesary
        String r1 = sentence6.substring(7);
        System.out.println(r1);// Java Programming starts given specific index gives till end of the string

        //---------------------------------------------------
        String sentence7 ="Today is Sunday, tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tomorrow);// Monday
        //---------------------------------------------------

        String sentence8 = "I study ay Cydeo School";
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);// cydeo school

        //---------------------------------------------------

        String str = "Python";
        String result = (str + "\n").repeat(10);// str + "\n" concetanation and be string.
        System.out.println(result);




    }
}
