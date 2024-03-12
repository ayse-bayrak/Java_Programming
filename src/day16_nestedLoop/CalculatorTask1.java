package day16_nestedLoop;

import java.util.Scanner;

public class CalculatorTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        while (true) {
            System.out.println("Enter first number");
            double num1 = input.nextDouble();
            System.out.println("Enter a math operator");
            char operator = input.next().charAt(0);
            while (!(operator == '+' || operator == '-'||operator == '*'||operator == '/')) {
                System.out.println("Invalid operator, please re-enter valid operator");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter the second number");
            double num2 = input.nextDouble();

            switch (operator) {
                case '+': result = num1 + num2 ; break;
                case '-': result = num1 - num2 ; break;
                case '*': result = num1 * num2 ; break;
                case '/': result = num1 / num2 ; break;
            }

            System.out.println(result);

            System.out.println("Would you like to continue? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no"))) {
                System.out.println("Invalid answer, please re-enter valid answer");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no")) {
                System.out.println("You terminated the calculator with your request. ");
                break;
            }

        }

        input.close();
    }
}
/*
1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)
 */