package day29_inheritance.animalTask;

public class Dog extends Animal { // Dog Is An animal
    //       C hild       Parent


    /*
    public void method() {

        // those 7 variables came from Animal class
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
        // five methods  are inherited
        setInfo();
        eat();
        drink();

        Those variables and methods are now the members of the dog class
        }

        */

    public void bark() {
        System.out.println(getName() + " is barking");
    }

}
/*

7 variables
5 methods
1. Dog
			attributes:

			methods:
					 bark()
 */