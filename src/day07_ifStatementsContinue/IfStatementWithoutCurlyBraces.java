package day07_ifStatementsContinue;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;
        if (age>=21){
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }
        System.out.println("========================");
        if (age >= 21) System.out.println("Eligible");
        else System.out.println("Not eligible");

        System.out.println("========================");

        int day = 2; //1~7
        // one satatement curly braces optional
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");


    }
}
