package day09_scanner;
import java.util.Scanner;
public class ScannerMethods1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();// for integer
        System.out.println("Your age is= " + age);

    }
}
