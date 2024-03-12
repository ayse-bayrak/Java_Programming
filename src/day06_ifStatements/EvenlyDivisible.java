package day06_ifStatements;
/*
Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
            Evenly Divisible ==> remainder is zero
 */
public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 60;
        boolean isDivisible2 = number % 2==0;
            // if the remainder of number divided by 2 is equal to zero,then it's evenly divisible by 2

        boolean isDivisible3 = number % 3==0;
            // if the remainder of number divided by 3 is equal to zero,then it's evenly divisible by 3

        boolean isDivisible5 = number % 5==0;
            // if the remainder of number divided by 5 is equal to zero,then it's evenly divisible by 5

        System.out.println(number + " is divisible by 2: " +isDivisible2);
        System.out.println(number + " is divisible by 3: " +isDivisible3);
        System.out.println(number + " is divisible by 5: " +isDivisible5);
    }
}
