package day06_ifStatements;
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given,
Write a program that can print the name of the month that the number represents
Ex: Given:
number = 10
output: October
 */
public class MonthNameTask7 {
    public static void main(String[] args) {
        int n=11;
        String result= "";
        if (n==1){
            result="January";
        }
        if (n==2){
            result= "February";
        }

        if (n==3){
            result = "March";
        }

        if (n==4){
            result = "April";
        }

        if (n == 5) {
            result = "May";
        }
        if (n == 6) {
            result = "June";
        }

        if ( n == 7) {
            result = "July";
        }

        if (n==8) {
            result = "August";
        }
        if ( n == 9) {
            result = "September";
        }
        if ( n == 10) {
            result = "October";
        }
        if ( n == 11) {
            result ="November";
        }
        if (( n == 12)) {
            result = "December";
        }
        System.out.println(result);
    }
}
