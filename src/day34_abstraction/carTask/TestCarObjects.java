package day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {

       // Car car = new Car( "x^", "red", 2020, 45000);
        // we can not create objects from an abstract class, object  MUST be created from a concrete class
        // Conc ret class is extending this abstract class, child of abstract class
        // for example Honda class

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);
        Audi audi = new Audi("Q6", "Silver", 2020, 36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("===============================================");

        honda.stop();  // they do have same implementation, because final method
        audi.stop();
        tesla.stop();

        System.out.println("===============================================");

        honda.start();  //  three different implementation, because abstract method
        audi.start();
        tesla.start();

        System.out.println("===============================================");

        audi.autoPark();
        tesla.autoPilot();

    }
}
