package day25_constructer;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(String food) {

        System.out.println(name + " is eating " + food);
    }

    public void sleeping() {

        System.out.println(name + " is sleeping");
    }

    public void drinking(String drink) {

        System.out.println(name + " is drinking " + drink );
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;




    }
}
/*
name
age
gender
dateOfBirth
isMarried
isEmployed
Add a constructor that can set all the fields one an object is created
toString(), eat(String food), sleeping, drink(String drink)
 */