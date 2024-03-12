package day25_constructer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTask {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/M/y");

        LocalDateTime DateAndTime = LocalDateTime.of(2020, 11, 24, 13, 00, 12);

        System.out.println(DateAndTime.format(dtf));
    }
}
/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */