package day09_scanner;

import java.util.Scanner;

public class Task3MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for Month");
        int num1 = input.nextInt();
        String result ="Invalid";
        if(num1>0 && num1 <=12){
            switch (num1){
                case 1: result="January";
                break;
                case 2: result="February";
                    break;
                case 3: result="March";
                    break;
                case 4: result="April";
                    break;
                case 5: result="May";
                    break;
                case 6: result="June";
                    break;
                case 7: result="July";
                    break;
                case 8: result="August";
                    break;
                case 9: result="September";
                    break;
                case 10: result="October";
                    break;
                case 11: result="November";
                    break;
                default:result="December";
                    break;

            }

        }

        System.out.println(result);
    }
}
