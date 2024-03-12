package day32_finalKeyword.carTaskMethodOverriding;

public class TestCarObject {
    public static void main(String[] args) {

        final Toyota toyota = new Toyota("Camry", 2020,"Blue",  25000);

        Honda honda = new Honda("Accord", 2019, "Gray", 24000);

        Audi audi = new Audi("Q6", 2021, "Silver", 50000);

        BMW bmw = new BMW("X6", 2017, "Black", 45000);

        Tesla tesla = new Tesla("Model 3", 2022,"White",  65000);

        toyota.setModel("corollla");
        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("------------------------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("------------------------------------------------------");

         //tesla.setPrice(30000);
         //tesla.setModel("Model H");

        System.out.println(tesla);



    }
}
