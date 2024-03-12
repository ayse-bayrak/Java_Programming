package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.Phone.Nokia;
import day30_inheritance.Phone.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypesCasting {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Cat cat = new Dog(); error, because there is not a relation

        Animal animal = (Animal) new Dog(); // implicit casting.. (Animal) is redundant

        System.out.println("===================================================");
        Animal animal1 = new Dog(); // upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'F', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        // one way is

        ( (Dog)animal1 ).bark();  // downcasting
        // dog object can be referenced by Dog..
        // it can allow you to cast animal reference type to the Dog,
        //and animal object will have Dog reference type
        //This is how I can call the bark method through this reference variable.
        //First ==> I have to cast it to the Dog and then ===> I can call the bark() method
        // This is the reason why we need to the downcasting, without the downcasting
        //without downcasting, there is no way that you can call access the features of object type
        //that does not exist in this current reference type (in here Animal)

        // second way is

        Dog dog1 = (Dog) animal1; // downcasting
        //I didn't create a new object, we are still using the same object

        //only difference between one way and second way:
        //one way you can only use it one time
        //second way you can reuse it because you did assign it to a variable

        System.out.println("===========================================================");

        // When you do downcasting, if this object is casted to something that does not have is a relationship,
        //then you are going to get ClasCastException error.
        // make sure that there is the relationship between the object and type that you are casting to

        //((Cat) animal1).scratch(); //  animal1 is dog object does not have is a relationship wit Cat
        //Dog can not be converted the Cat, because there is no is a relationship between Dog and Cat

        System.out.println("====================================================");
        Phone phone = new Nokia("XR20", "Small", "Blue", 350);
        //There is a polymorphism, Parent is referencing it to the child.
        // if there is polymorphism means, there is also UpCasting.
        // UpCasting is the reason why you do have the polymorphism

        phone.call(255234);
        phone.text(623532);
        ((Nokia)phone).selfDefense(); // Because phone is Nokia object and Nokia can not be converted to Iphone,
        //Because there is no is a  relationship between Nokia and Phone

        //whenever you do casting,
        // you need to make sure that the object type that this reference variable is referencing to
        // MUST have is a relationship with yhe IPhone.

        // if there is a relationship, Intellij tells us available solution for cast,
        //Because intellij knows that is there is a relationship or not.

        ((Nokia) phone).selfDefense();

        Employee employee = new Developer ("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");
        employee.work();
        System.out.println(  ((Developer) employee).getProgrammingLanguage()  );

        // Driver driver = (Driver) employee;

        Electric electric = (Electric) new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        //Reference type decides which method/instances  can be called- whether it's accesible or not

        electric.charge();
        ( (Tesla)electric ).selfDrive(); // Electric can be referenced to the Tesla object
        ((AutoPilot) electric) .selfDrive(); // Autopilot can be referenced  to the Tesla object instead of Electric
        // Because ther is a reletionship between autopilot and this object. So this is a casting

        System.out.println("==========");

        Employee employee1 = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);
        Employee employee2 = new Developer ("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");
        Employee employee3 = new Driver("Aeron", 48, 'M', "D1", "Truck Driver", 90000);
        Employee employee4 = new Tester("Emiliy", 35, 'F', "E1", "Manuel Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4 .work();


    }
}
