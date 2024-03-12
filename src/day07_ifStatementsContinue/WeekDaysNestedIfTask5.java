package day07_ifStatementsContinue;

public class WeekDaysNestedIfTask5 {
    public static void main(String[] args) {
        int number = 9;
        String weekDay = " ";

        if(number >=0 && number <=7) {

            if (number == 1) {
                weekDay = "Monday";
            } else if (number == 2) {
                weekDay = "Tuesday";
            } else if (number == 3) {
                weekDay = "Wednesday";
            } else if (number == 4) {
                weekDay = "Thursday";
            } else if (number == 5) {
                weekDay = "Friday";
            } else if (number == 6) {
                weekDay = "Saturday";
            } else {
                weekDay = "Sunday";
            }

        }
        else {
            weekDay = "Invalid Input";
        }
        System.out.println(weekDay);

    }
}
