package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPerson {

    public static void main(String[] args) {

       Person p1 = new Person("Ayse", 4, 'F', LocalDate.of(2024, 10, 21));
//NAME TEST
       // p1.setName("      ");
//        p1.getName();
//        System.out.println(p1.getName());
//AGE TEST
//        p1.getAge();
//        System.out.println(p1.getAge());
        //GENDER TEST
        System.out.println(p1.getGender());

//DATEOFBIRTH TEST

        System.out.println(p1.getDateOfBirth());
    }

}
