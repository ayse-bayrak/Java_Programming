package day28_encapsulation.personTask;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name) {// Allows us to create Person object just by setting the name of the person
        this.name = name;
    }
    public Person(String name, int age) { // Allows us to create Person objects by setting the name  and the age of the person
        this(name);
        this.age = age;
    }
    public Person(String name, String language) {// Allows us to create Person objects by setting the name  and the language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {// Allows us to create Person objects by setting the name  and the gender of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {// Allows us to create Person objects by setting the name, the age and the gender   of the person
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {// Allows us to create Person objects by setting the name, the age, the gender and the language   of the person
        this(name, age, gender);
        this.language = language;
    }

    static { // static only accepts static
        planet = "Dunya";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public static void printPlanetName() { // we just only need variable Planet, this variable is static
        // if you don't need any instances ypu should decalare methods as static

        System.out.println("Planet name is: " +planet);

    }

    public void eat(String food) {// if you need instance variable, method should be instance
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {// if you need instance variable, method should be instance
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */