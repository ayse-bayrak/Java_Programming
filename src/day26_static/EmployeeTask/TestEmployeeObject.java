package day26_static.EmployeeTask;

import java.util.ArrayList;

public class TestEmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ayse");
        Employee employee2 = new Employee("Ayse", 'F');

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
