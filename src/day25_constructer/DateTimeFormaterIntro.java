package day25_constructer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterIntro   {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));//Dec/23/2023 Saturday

        LocalDate date1 = LocalDate.of(2022, 7, 1);

        System.out.println(date1.format(df));  // Jul/01/2022 Friday


        DateTimeFormatter tf  = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17, 30);

        System.out.println( time1.format(tf) ); //05:30 PM


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));//Saturday, Dec/23/2023  10:48 AM

    }
}
