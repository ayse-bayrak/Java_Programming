package day07_ifStatementsContinue;
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given,
Write a program that can print the name of the month that the number represents
Ex: Given:
number = 10
output: October
otherwise print invalid
 */
public class MonthNameTask6_7 {
    public static void main(String[] args) {
        int n = 13;
        String result = "";

        if (n >= 1 && n <= 12) {

            if (n == 1) result = "January";
            else if (n == 2) result = "February";
            else if (n == 3) result = "March";
            else if (n == 4) result = "April";
            else if (n == 5) result = "May";
            else if (n == 6) result = "June";
            else if (n == 7) result = "July";
            else if (n == 8) result = "August";
            else if (n == 9) result = "September";
            else if (n == 10) result = "October";
            else if (n == 11) result = "November";
            else result = "December";

        } else {
            result = "invalid";
        }
        System.out.println(result);
    }

    }
