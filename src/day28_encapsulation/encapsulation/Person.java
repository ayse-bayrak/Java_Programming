package day28_encapsulation.encapsulation;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class Person {

private String name;
private int age;
private char gender;
private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if (name == null){
           return "Unknown";
        }
        return name;
    }

    public void setName(String name) {//can not be null/empty/blank
        if (name==null || name.isEmpty() || name.isBlank()) {
            System.err.println("name can not be null/empty/blank " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //Write: age can not be less than zero or greater than 120
    public void setAge(int age) {
        if (age<0 || age > 120) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {//gender can only be 'M' or 'F'
        if ( !(gender== 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) { //can not be after today's date
        if (dateOfBirth.isAfter(LocalDate.now())) {
            System.err.println("Date Of Birth can not be after today's date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*
Variables:
name, age, gender, dateOfBirth
name :
Write: can not be null/empty/blank
Read : if name is null, return "Unknown" instead

age:
 Write: age can not be less than zero or greater than 120

 gender:
 Write: gender can only be 'M' or 'F'

 dateOfBirth:
 Write: can not be after today's date

 Add a contructor that can set all the fields

 Add a toString()
 */