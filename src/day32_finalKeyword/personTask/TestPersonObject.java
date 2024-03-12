package day32_finalKeyword.personTask;

import day33_abstraction.CydeoDevStudent;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));

        System.out.println(person);
        person.breath(); // since the breath method is final same action super class and sub class

        System.out.println("================================");

        Employee employee = new Employee("Emiliy", 'F', LocalDate.of(1989, 2, 5), "Accountat", 100000);

        System.out.println(employee);
        employee.breath();

        Student student = new Student("Ayse", 'M', LocalDate.of(1982, 10, 21), 'A', 25);

        System.out.println(student);
        student.breath(); // method is final, so same action with parent class

        System.out.println("================================");

        CydeoDevStudent cydeoDevStudent =new CydeoDevStudent("Ayse", 'F', LocalDate.of(1982, 10, 21), "2", "US-JD-02", 2);

        System.out.println(cydeoDevStudent);
        cydeoDevStudent.eat();
        cydeoDevStudent.breath();
        cydeoDevStudent.drink();
        cydeoDevStudent.sleep();

    }
}
