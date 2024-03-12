package day24_date_and_time;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    // we need three information, so setInfo three instance variables, age should be calculated


    public void setInfo(String name, char gender, LocalDate dateOfBirth) { //less argument is better, we need those
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()-dateOfBirth.getYear();
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
