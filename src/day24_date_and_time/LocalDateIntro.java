package day24_date_and_time;

import java.beans.BeanInfo;
import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        //now() method
        //of() method

        // birthDay = LocalDate.of(-1000,12, 32);
        //System.out.println(birthDay);// ERROR DateTimeException because invalid day

        //birthDay = LocalDate.of(1999, 2, 29);

        //System.out.println(birthDay); // ERROR DateTimeException because invalid day 1999 not leap year

        LocalDate today = LocalDate.now(); //2022-6-16 // immutable

        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1999, 2, 28);
        LocalDate myBirthday = LocalDate.of(1982,10,21);

        System.out.println(birthDay);

        System.out.println("-------------------------------------------");

        System.out.println( today.getYear() );//2023

        System.out.println(today.getMonth());//DECEMBER

        System.out.println(today.getMonthValue());//12

        System.out.println(today.getDayOfWeek());//THURSDAY

        System.out.println(birthDay.getDayOfWeek());//SUNDAY

        System.out.println(today.getDayOfMonth());//21

        System.out.println(today.getDayOfYear());//355

        System.out.println("-------------------------------------------------");

        today =  today.plusYears(1); // 2024-12-21

        System.out.println(today);

        System.out.println("-------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        graduationDate = graduationDate.plusYears(2); // 2027-6-4 //n new LocalDate object

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("--------------------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);//2005-04-01
        System.out.println(yourBrotherBirthDay);//2003-01-01

        System.out.println("--------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);//true

        System.out.println(r1);


        System.out.println("--------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(  grad_date.isBefore(  LocalDate.of(2022, 12, 31) ));
        System.out.println(  grad_date.isAfter(  LocalDate.of(2022, 12, 31) ));

        System.out.println("----------------------------------------------");

        System.out.println(  LocalDate.of(2022, 6, 16).isLeapYear()  );

    }
}
