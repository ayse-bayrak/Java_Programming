package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudent {
    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1989, 11, 1), "A1", "zero to hero", 2);
        CydeoDevStudent student2 = new CydeoDevStudent("Ziya", 'M', LocalDate.of(1978, 11, 1), "A1", "zero to hero", 2);
        System.out.println(student1);

        // test it by changing all variables
        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();
        student2.breath(); // breath method do not change according to object, because it is final method. same implementation

    }
}
