package day06_ifStatements;
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given,
Write a program that can print the name of the day that the number represents
Ex: Given:
number = 1
output: Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */
public class WeekDaysTask6 {
    public static void main(String[] args) {
        int number = 7;
        String weekDay= " ";

        if (number==1){
            weekDay="Monday";
        }
        else if (number==2){
            weekDay="Tuesday";
        }
        else if (number==3){
            weekDay="Wednesday";
        }
        else if (number==4){
            weekDay="Thursday";
        }
        else if (number==5){
            weekDay="Friday";
        }
        else if (number==6){
            weekDay="Saturday";
        }
        else if (number==7){
            weekDay="Sunday";
        } else {
            weekDay= "Invalid Input";
        }
        System.out.println(weekDay);

    }
}
