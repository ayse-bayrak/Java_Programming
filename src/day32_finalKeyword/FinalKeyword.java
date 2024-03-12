package day32_finalKeyword;

import java.time.LocalDate;

class Student{ // parent class can not be final
    public final void language(){ // final method
        System.out.println("Java Programming");
    }
}

public final class FinalKeyword extends Student { // child class can be final

    /*
    public void language(){ // final methods can never be overridden
        System.out.println("Python Programming"); // "Python Programming"
    }
*/

    public FinalKeyword(){  // this is my constructor, final can not be applied constructor

    }

    public static void main(String[] args) {

        final char gender = 'M'; // it is a local variable, i declared it within the method.

        System.out.println(gender); // M

        //  gender = 'F'; // old value is gone
        System.out.println(gender); // F

        System.out.println("-----------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        //  dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("-----------------------------------");

        new Student().language();
        new FinalKeyword().language(); //

        System.out.println("-----------------------------------");

        final String name = "James"; // when the reassigned original object will be eligible for garbage collection
        // name = null;
        // name = "Daniel";

        System.out.println(name);



    }

}