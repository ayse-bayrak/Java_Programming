package day29_inheritance.animalTask;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal { // Cat Is An animal

    public void meow() {
        System.out.println(getName() + " is meowing");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching");
    }

}
/*
Cat
			attributes:


			methods:
				meow(), scratch()
 */