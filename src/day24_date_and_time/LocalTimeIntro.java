package day24_date_and_time;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        //LocalTime is also immutable

        LocalTime starting_time = LocalTime.of(10, 30); //24 hours format

        System.out.println(starting_time);

        LocalTime right_now = LocalTime.now(); // if you want to get current time

        System.out.println(right_now);

        System.out.println("------------------------------------------------");

        LocalTime time1 = LocalTime.of(23, 59, 59);// max numbers for times otherwise, you will get DateTimeRxception

        System.out.println(time1);//23:59:59

        time1 = time1.plusHours(1);

        System.out.println(time1);//00:59:59

        time1 = time1.plusMinutes(45);
        System.out.println(time1);//01:44:59

    }
}
