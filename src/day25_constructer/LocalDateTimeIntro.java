package day25_constructer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023, 5, 18, 11, 0);

        System.out.println(ends);

        //You could call methods both LocalDate and LocalTime

        System.out.println(starts.getDayOfWeek()); // LocalDate method

        System.out.println(starts.getHour()); // Local Time method


    }
}
