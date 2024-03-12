package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String u, p;
        int attempt = 3;
        do {
            if (attempt<3) {
                System.err.println("Invalid credential, you have " +attempt + " attempt, try again");
            }
            System.out.println("Enter your username");
            u = input.next();
            System.out.println("Enter your password");
            p = input.next();
            attempt --;


            if(u.equals("Cydeo")&& p.equals("WoodenSpoon")) {
                System.out.println("You are logged in");
            }

            if (attempt ==0 ){
                break;
            }

        }while (! (u.equals("Cydeo")&& (p.equals("WoodenSpoon"))));// while credential is invalid


    }
}
