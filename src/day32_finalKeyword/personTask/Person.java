package day32_finalKeyword.personTask;
import java.time.LocalDate;
public class Person {
    private String name; //if variable is instance, it is better to use private access modifier
    private final char gender;  // if variable is final, they do not have default value,
    // so as long as assign value give you compile error, we create constructor and initialize them.
    private final int age;
    private final LocalDate dateOfBirth;
    public static final int numberOfHead;
    static {
        numberOfHead =1;
    }
    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if  (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender "+ gender);
            System.exit(1);
        }
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear()- dateOfBirth.getYear();
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setName(String name) {
        this.name = name;
    } // setter allows to change the value of the variable,
    // if you try to generate to setter, it gave you one option, only name.
    // So the final value, those are gender, age, dataOfBirth,
    // they are unchangeable and setter it wants to change them.
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void drink() {
        System.out.println(name + " is drinking");
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public final void breath() { // To make sure that this implementation will not change for any sub class
        System.out.println(name + " is breathing");
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*
variables:
name, gender, age, dateOfbirths
numberOfHead,

methods:
eat(food) , drink(drink) , sleep ()
breath()

 */