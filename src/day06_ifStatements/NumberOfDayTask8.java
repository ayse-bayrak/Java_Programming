package day06_ifStatements;
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given,
Write a program that can print the number of days in the given month
Ex: Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */
public class NumberOfDayTask8 {
    public static void main(String[] args) {
        int month=10;
        String result="";
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            result="31 days";
        }
        if (month==4||month==6||month==9||month==11){
            result="30 days";
        }
        if (month==2){
            result="28 days";
        }
        System.out.println(result);
        System.out.println("============Muhtar's Code===========");
        int n=10;
        boolean has28Days= n==2;
        boolean has30Days = n==4||n==6||n==9||n==11;
        boolean has31Days = !has30Days && !has30Days;
        // if the month does not 28 days and also does not have 30 days,
        // then month has 31 days
        if (has28Days){
            result="28 days";
        }
        if (has30Days){
            result="30 days";
        }
        if(has31Days) {
            result="31 days";
        }
        System.out.println(result);
    }
}
