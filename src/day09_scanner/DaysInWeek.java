package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;// you don't have to put manually but you must know structure

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        //Scanner input = new Scanner(System.in);
       int num = new Scanner (System.in).nextInt() // garbage collection
    if you need only one input, you can use garbage collection.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of number: ");
        int num= input.nextInt();
        String day = "Invalid";
        if (num>=1 && num<=7) {
            /* with ternary
            day = (num==1)? "Monday" :(num==2)? "Tuesday" :(num ==3)? "wednesday"
                    :(num==4)? "Thursday":(num==5)?"Friday":(num==6)?"Saturday":"Sunday";
            */
            switch (num){
                case 1: day ="Monday";
                break;
                case 2: day ="Tuesday";
                    break;
                case 3: day ="Wednesday";
                    break;
                case 4: day ="Thursday";
                    break;
                case 5: day ="Friday";
                    break;
                case 6: day ="Saturday";
                    break;
                case 7: day = "Sunday";
                break;
            }
            }
        System.out.println(day);
        input.close();
        }
}
