package day35_polymorphism;

import day34_abstraction.Person;
import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        // this is tiger object, reference type is Tiger, Tiger is referencing to the tiger object,
        //So there is no polymorphism
        //so whatever the method that you had in the tiger class, you can always call it.

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();

        Animal tiger1 = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        // tiger1.hunt();// compile error, because Only the Methods && Variables in reference type can be called
        // hunt() method is not in the reference type animal

        // and when we call a method, it will call overridden version from a child class
        // but if method is not overridden, it will call parent/super class version

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Blue");
        //animal.fly(); // because Animal class does not have fly() method
        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Blue");
        //obj1.eat(); because Flyable interface does not have those methods
        //obj1.sleep();
        //obj1.drink();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null; // we need to instantiate the object before we use them
        //Because local variables, you have to instantiate them before use them, this variable is still a local variable,
        //you declare that inside the method
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar = null;
        Person person = null;

        Flyable[] birds = {parrot, eagle, duck };
        // I can only store the ones that have is a relationship with Flyable.
        Swimmable[] fishes = {shark, dolphin, duck, cydeoCar, person };
        // I can only store the ones that have is a relationship with Swimmable
        //Playable[] friendlyAnimals = {lion, shark, eagle}; // they do not have is relationship here
        Playable[] friendlyAnimals = {dolphin, cat, duck, dog};
        // I can only store the ones that have is a relationship with Playable

        // Polymorhism means either parrent class or parent interface could be the reference, object is created from child class.
        // That's the only time that polymorphism occurs otherwise there can be no polymorphism.

        //boolean isAnimal = cydeoCar instanceof Animal;
        // in order to use this instanceof keyword is relationship is a MUST.
        // but right now since there is no relationship we are getting error

        boolean isAnimal = dog instanceof Animal;
        //dog class does have is relationship with the animal

        System.out.println(isAnimal);

        System.out.println("=====================");
        Car car = new Tesla("Tesla", "Model Y", "White",2020, 55000) ;

        boolean isTesla = car instanceof Tesla;
        //Car class does have is relationship with the Tesla
        boolean isAudi = car instanceof Audi;
        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla); // true
        System.out.println("isAudi = " + isAudi); // false
        System.out.println("isElectric = " + isElectricCar); // true
        System.out.println("hasAutoPark = " + hasAutoPark); // true
        System.out.println("hasAutoPilot = " + hasAutoPilot); // true

        System.out.println("=================================");


    }

}
