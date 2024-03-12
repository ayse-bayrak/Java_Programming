package day16_nestedLoop.warmupTask;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        String userName = "Cydeo";
        String password = "WoodenSpoon";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your user name and password");
        String enteredUsername = input.next();
        String enteredPassword = input.next();

        //Howmany possible outputs do we have? two , either correct or incorrect..


        if ((enteredUsername.equals(userName)) && (enteredPassword.equals(password))) { //if credentials are correct, both has to be correct

            System.out.println("Logged in.");

        } else { //otherwise credentials are NOT  correct

            for (int i = 0; i <3 ; i++) {

                System.err.println("The credentials are not correct, you have "
                        + (3-i) + " attempts to enter correct credentials ");

                if(i==2) {
                    System.err.println("This is your last chance, please be careful");
                }

                System.out.println("Please enter your user name and password");
                enteredUsername = input.next();
                enteredPassword = input.next();

                if ((enteredUsername.equals(userName)) && (enteredPassword.equals(password))) {
                    System.out.println("You are now logged in.");

                    break;
                }
            }
            if (!((enteredUsername.equals(userName)) && (enteredPassword.equals(password)))) { // after all three attempts credentials are NOT
                System.err.println("Your account now is lucked, please contact with the support team");
            }
        }

    input.close();
    }

}
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */