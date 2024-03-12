package day11_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogInWarmupTask2 {

    public static void main(String[] args) {

        String correctUsername= "Cydeo", // literal
                correctPassword ="WoodenSpoon"; // literal

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scan.nextLine(); // new keyword

        System.out.println("Enter password");
        String password = scan.nextLine(); // new keyword

        scan.close();

        //if (username.equals("Cydeo")&&password.equals("WoodenSpoon")) it can be like this
        if (username.equals(correctUsername) && password.equals(correctPassword))
        {
            System.out.println("You are logged in");
        }else {
            System.err.println("Incorrect username or password. Please try again");// with err. give me red color output

        }
    }
}
