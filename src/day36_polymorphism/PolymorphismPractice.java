package day36_polymorphism;

import day30_inheritance.Phone.IPhone;
import day30_inheritance.Phone.Nokia;
import day30_inheritance.Phone.Phone;
import day30_inheritance.Phone.Samsung;
public class PolymorphismPractice {
    public static void main(String[] args) {
        //IPhone phone = new Phone("Iphone 11 Pro", "Large", "Black", 900);
        // is it possible that I can let child class to be referenced to the parent object
        // no, i am getting compile error, because polymorphism means
        // letting the parent type parent class or parent interface to be referenced to the child object.
        //child, it can not to be referenced to the parent object
        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "White", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };
        //model - color - price
        for (Phone eachPhone  : phones) {
            System.out.println(eachPhone.getModel()+" - "+eachPhone.getColor()+" - "+eachPhone.getPrice());
        }
        System.out.println("===============================================");
        int numberOfIphone = 0,
            numberOfSamsung = 0,
            numberOfNokia= 0;
        for (Phone each : phones) {
            if (each instanceof IPhone) { // if the phone is IPhone
                // there is a possibility that one parent referebce type, it could be 100 or 100 different object
                // if you want to verify if this object is the instance of specific child class,
                //then you have to use the instance of keyword. That's the reason why we have this instance of keyword.
                //and it must have "is relationship" with the reference class type and object type
                numberOfIphone++;
            } else if (each instanceof Samsung) { // if the phone is Samsung
                numberOfSamsung++;
            } else {
                numberOfNokia++;
            }
        }

        System.out.println("numberOfIphone = " + numberOfIphone);
        System.out.println("numberOfSamsung = " + numberOfSamsung);
        System.out.println("numberOfNokia = " + numberOfNokia);

        System.out.println("===============================================");

        for (Phone eachPhone : phones) {
            if (eachPhone instanceof IPhone || eachPhone instanceof Samsung){ //if the phone is Iphone or Samsung
                if (eachPhone.getPrice()>=700) {
                    System.out.println(eachPhone.getModel());
                }
            }
        }
        }
}
/*
Warmup task:
	Given the following array:
		.......

    1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

 */