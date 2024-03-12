package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // String answer = "yes";
        //while (answer.equals("yes")) {
        while (true) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + "even number");
            } else {
                System.out.println(number + "odd number");
            }

            System.out.println("Would you like enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || (answer.equals("no")))) {
                System.out.println("Invalid Entry! Would you like enter another number? Yes/No");
            }

            if (answer.equals("no")) {
                break; // it is in while loop, so this is jump tu while loop
            }
        }
        input.close();
    }
}
