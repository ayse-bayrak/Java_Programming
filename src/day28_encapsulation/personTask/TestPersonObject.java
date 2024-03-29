package day28_encapsulation.personTask;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Muhammed");
        Person person2 = new Person("Abidullah", 'M');
        Person person3 = new Person("Hasan", 30);

        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatina",25, 'F');
        Person person6 = new Person("Lucy", 31, 'F', "English");

        System.out.println(person1);
        //Person{name='Muhammed', age=0, gender= , language='null', planet='Dunya'}

        System.out.println(person2);
        //Person{name='Abidullah', age=0, gender=M, language='null', planet='Dunya'}

        System.out.println(person3);
        //Person{name='Hasan', age=30, gender= , language='null', planet='Dunya'}

        System.out.println(person4);
        //Person{name='Daniel', age=0, gender= , language='English', planet='Dunya'}

        System.out.println(person5);
        //Person{name='Tatina', age=25, gender=F, language='null', planet='Dunya'}

        System.out.println(person6);
        //Person{name='Lucy', age=31, gender=F, language='English', planet='Dunya'}

        person4.name = "James"; // if it is instance only changes to this name
        //person4.planet = "Mars"; // all the object's planet is changed

        Person.planet = "Mars";

        Person.printPlanetName(); // it change

        person1.eat("Baklava"); //only the first one

        person2.drink("Water");

        person5.drink("Tea");
        person6.drink("Coffee");


    }
}
