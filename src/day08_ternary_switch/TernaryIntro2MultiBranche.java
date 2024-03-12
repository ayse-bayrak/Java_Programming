package day08_ternary_switch;

public class TernaryIntro2MultiBranche {
    public static void main(String[] args) {
        int number = -20;
        String result = "";

        result = (number>0) ? "Positive" : (number< 0) ?  "Negative" : "Zero";
        System.out.println(result);

        System.out.println("=====================================");

        int number1 = 7;
        String weekDay= " ";
        /*
        if (number1==1){
            weekDay="Monday";
        }
        else if (number1==2){
            weekDay="Tuesday";
        }
        else if (number1==3){
            weekDay="Wednesday";
        }
        else if (number1==4){
            weekDay="Thursday";
        }
        else if (number1==5){
            weekDay="Friday";
        }
        else if (number1==6){
            weekDay="Saturday";
        }
        else if (number1==7){
            weekDay="Sunday";
        } else {
            weekDay= "Invalid Input";
        }
        System.out.println(weekDay);
        */

        String weekday = (number1 ==1)? "Monday" : (number1==2)? "Tuesday" : (number1==3)? "Wednesday" :
                (number1 == 4) ? "Thursday": (number1==5) ? "Friday" : (number1 ==6) ? "Sturday" : "Sunday";
        System.out.println(weekday);


        System.out.println("==================");
        /*
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
         */





    }
}
