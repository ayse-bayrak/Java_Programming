package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'F', 4, "Large", "White");
        Cat cat = new Cat();
        cat.setInfo("Gumus", "Scotish", 'F', 3, "Medium", "Grey");
        Tiger tiger = new Tiger();
        tiger.setInfo("Shere Khan", " Bengal", 'M', 5, "Large", "Orange" );

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


        System.out.println("=================================================================");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("=================================================================");

        dog.bark();
        //cat.bark();
        //tiger.bark();

        cat.meow();
        cat.scratch();
        //dog.meow();
        //tiger.meow();

        tiger.hunt();
        //cat.hunt();

        System.out.println("=================================================================");

        cat.getColor();
        cat.getBreed();

        System.out.println(dog.getName() + " : " + dog.getAge());

        System.out.println(cat.getBreed() + " : " + cat.getColor());

        dog.setAge(4);
        dog.setName("Alabas");
        cat.setName("Gumus");

        System.out.println(dog.getName());
    }
}
