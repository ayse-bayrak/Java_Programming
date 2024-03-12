package day11_string;

public class StringMethod3BooleanMethods {
    public static void main(String[] args) {
        //isEmpty () methods----------------------------------
        String word = "Java";
        boolean r1 = word.isEmpty();
        System.out.println(r1);//false because we do have characters in the string
        //isBlank () methods  --------------------------------------------------
        String str1 = "              ";
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());
        String str2 = "";
        System.out.println(str2.isEmpty());//true
        System.out.println(str2.isBlank());//true

        //equals () methods  --------------------------------------------------
        String str3 = "Cydeo";
        String str4 = new String("Cydeo");
        System.out.println(str3==str4);// false
        System.out.println(str3.equals(str4)); // true
        String str5 = "cydeo";
        System.out.println(str3.equals(str5));// false
        //equalsIgnoreCase  () methods  --------------------------------------------------
        System.out.println(str3.equalsIgnoreCase(str5));//true

        //contains (str) methods  --------------------------------------------------
            String students = "Hasan Naran Sumeye Natalia";
        System.out.println(students.contains("Ahmet"));//false

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.contains("java");//false
        boolean hasJava1 = sentence.toLowerCase().contains("java");//true
        //sentence.toLowerCase() is new sentence and then call the contains method to checj java...

        //starsWith and endWith (str) methods  --------------------------------------------------
        String name = "Micheal";
        boolean l = name.startsWith("Da");//false
       String url = "www.cydeo.com"; //check if valid url
        boolean isValid = url.startsWith("www.");//true
        boolean t = url.endsWith(".com");//true

        System.out.println(name.startsWith("Mi"));

        //-----------------------------------------------------------------------------
        String email = "CydeoSchool@gmail.com" ;
        boolean isGmail = email.endsWith("gmail.com");// true
        boolean isYahoo = email.endsWith("yahoo.com");// false
        boolean isHotmail = email.endsWith("hotmail.com"); //false

        System.out.println("isGmail = " + isGmail);
        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);
    }
}
