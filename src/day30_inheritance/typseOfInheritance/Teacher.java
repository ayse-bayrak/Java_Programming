package day30_inheritance.typseOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teacher extends Employee{// person is the grandparent of teacher
    // employee is the parent of teacher

    public Teacher(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    public void teach() {
        System.out.println(getName() + " is teaching");
    }

}
