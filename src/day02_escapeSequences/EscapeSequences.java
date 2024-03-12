package day02_escapeSequences;

public class EscapeSequences {
    public static void main(String[] args) {
        //new line: \n
        System.out.println("Hello World\nHello Cydeo");
        /*
        output:
         Hello World
         Hello Cydeo
         */
        //horizontal tab :\t
        System.out.println("\tJava Programing Language");
        System.out.println("\t\tJava developer Course Batch1");
        // output:      Java Programing Language
        //                      Java developer Course Batch1

        //backslash: \\
        System.out.println("\\ ");
        //output: \

        //double quote: \"
        System.out.println("I like \"Wooden Spoon\"");
        // output:I like "Wooden Spoon"
    }
    /*
    1.\n: new line
    2.\t: paragraph space
    3.\\:back slash
    4.\": double quote
     */
}
