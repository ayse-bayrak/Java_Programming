package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new  Scanner(Path.of("src/day10_string/Test.txt"));

       /*
        it reads the entire line

        System.out.println( scan.nextLine());
        System.out.println( scan.nextLine());
        System.out.println( scan.nextLine());
        */
/*
If you want to read word byy word you could use the next method of scanner
 */
        System.out.println( scan.nextLine());
        //String line1 = scan.next();
        System.out.println( scan.next());
        System.out.println( scan.next());
        //System.out.println("line1 = " + line1);
        System.out.println( scan.hasNext());// is going to return true or false, as long as there is a word that can be true
        /*
        What if I did not have anything in this text file I get compile error "NoSuchElementException"
         */

        scan.close();

    }
}
