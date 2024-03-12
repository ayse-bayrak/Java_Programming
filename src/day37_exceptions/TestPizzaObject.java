package day37_exceptions;

public class TestPizzaObject {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('S', 2,3);
        Pizza pizza2 = new Pizza('S', 2, 3);
        // when we use the new keyword, it will be opened in the Java Heap memory

        System.out.println(pizza1 == pizza2); // false

       //In my expected condition as long as the two pizza has the same size and same number of cheese topping,
        //then should be equal, doesn't matter if two of those objects are different object or same objects
        // that's why I need to use the equals method I override it in the Pizza class

        //System.out.println(pizza1.equals("Java"));//Invalid Object: Java, because of condition ==>"if (!(obj instanceof Pizza))"
        //System.out.println(pizza1.equals(100));//Invalid Object: Java
        //System.out.println(pizza1.equals(true));//Invalid Object: Java

        // why is accepting all of those because this equals method. if you look at the parameter type is object,
        //so it accepts everything, even though it accepts everything our responsibility to add this (instance of Pizza) condition
        // to make sure that the given object is what you are looking for what this method needs.
        // in here there is Pizza object, so we have to add this condition to make sure that given object is a pizza object
        /*
        if (!(obj instanceof Pizza)) { // if the specified object is not pizza
            System.err.println("Invalid Object" + obj);
            System.exit(1);
        }
         */

        //we need to pass Pizza object here, not the integer, or string, or car, it has to be Pizza object in order to return either true or false

        System.out.println(pizza1.equals(pizza2)); // true
        // size and number of pepperoni topping will be compared with current Pizza, if both of them are matched,
        //then it's going to return true

        Pizza pizza3 = new Pizza('S', 2,3);
        Pizza pizza4 = new Pizza('S', 2, 3);

        System.out.println(pizza3.equals(pizza4)); // true

        Object obj = new Pizza('L', 4, 5);
        // upcasting, that's why you can assign subtype to the super type directly just like the smaller primitive,
        // you can directly assign it to the larger parameter.


        System.out.println(obj.equals(pizza1)); //false

        boolean r = obj.equals(pizza2);
        System.out.println(r);// false

        double total = ((Pizza)obj).calcCost();
        System.out.println(total); //32

        //double area = ( (Circle)obj ).area();
        //System.out.println(area);// it is giving me exception, ClassCastException, because there is not is a relationship between Circle and Pizza



    }
}
