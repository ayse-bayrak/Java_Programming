package day31_inheritance.animal_methodOverriding;

public class TestAnimalObject {
    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bangle", 'F', 4, "Small", "Gray");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large","Yellow", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & WHite");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("--------------------------------------------------------");

        cat.eat();
        // override, which one of their implementations gets executed for this,
        // depends on the object
        dog.eat();
        eagle.eat();
        lion.eat();

        // How many eat methods are actually allocated in the Java Heap?
        // One: one method has four different implementation that are executed.

        System.out.println("----------------------------------------------------------");


        cat.sleep(); // only we did override the sleep method in the cat class
        dog.sleep(); // default sleep method gets executed, because we didn't override the sleep method in the dog class
        eagle.sleep();
        lion.sleep();


    }
}
