package day25_constructer;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ayse", 41,'F', "Java Developer",95000, LocalDate.of(2023, 10, 21));
        Employee e2 = new Employee("Khashayar", 32, 'M', "Java Developer", 95000, LocalDate.of(2022, 12, 2));

        Employee e3 = new Employee("Mohammad", 31, 'M', "Project Manager", 120000, LocalDate.of(2021, 5, 1));


        System.out.println(e1);

        System.out.println(e2);

        System.out.println(e3);

    }
}
