package day24_date_and_time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Ayse", 'F', LocalDate.of(1940, 10, 21));
        people[2].setInfo("Akif", 'M', LocalDate.of(2012, 6, 15));
        people[3].setInfo("Mahir", 'M', LocalDate.of(2012, 6, 15));
        people[4].setInfo("Betul", 'F', LocalDate.of(2018, 12, 7));



        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        // print name & date of birth of each person object

        for (Person eachStudent : studentsList) {
            System.out.println(eachStudent.name + " : " + eachStudent.dateOfBirth);
        }

        // remove all the person object that has the age > 55
       // list.removeAll( Arrays.asList(10, 20) );

            studentsList.removeIf(p-> p.age > 55);

        //System.out.println(studentsList);

        for (Person eachStudent : studentsList) {
            System.out.println(eachStudent.name + " " + eachStudent.age);
        }




    }
}
