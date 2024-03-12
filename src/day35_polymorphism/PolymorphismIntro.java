package day35_polymorphism;

import day31_inheritance.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};
        // there is "IS A" relationship between Animal and dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck.
        //Parent can reference to all the child objects,

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla
        // it can not be reference to the Tesla object

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //  animal.play();
        //  animal.bark();
        // it can not access method or variable that not existing animal class.
        // it does not mean parent class have all the child class' features.
        // Child class have all the features of parent class but parent class does not have the child class' features.

        System.out.println("---------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);
        Audi audi = new Audi("Q6", "Silver", 2020, 36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);
        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);
        Developer developer = new Developer ("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");
        Driver driver = new Driver("Aeron", 48, 'M', "D1", "Truck Driver", 90000);
        Tester tester = new Tester("Emiliy", 35, 'F', "E1", "Manuel Tester", 80000);

        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};
// Object can be reference all the object. Because Object class is parent of all the class in Java.
        System.out.println(Arrays.toString(objects));

        Object[] employees = {teacher, developer, driver, tester};
        //employees.work();  // Compile error because, reference type, it decides what you can call and can not call

        //But it is better to store specific reference type, for example employees objects should be stored Employee objects
        // if you do have the objects that are from same category, it is better if you be more specific about the reference type of those objects

        Employee obj = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);
        obj.work();//Aaron is driving

        Employee obj1 = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);
        obj1.work();//James is teaching

        //Object type is going to decide what implementation of the method should be executed.



    }
}
