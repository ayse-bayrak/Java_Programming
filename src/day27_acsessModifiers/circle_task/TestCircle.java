package day27_acsessModifiers.circle_task;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5 );

        //Circle object is created and 3.5 will be set to radius of the circle at the same time
        //Also, it is going to set the diameter as well.

        System.out.println(circle1);

        // OR you write separately

        System.out.println("Area is " + circle1.calcArea());
        System.out.println("Perimeter is "+ circle1.calcPerimeter());
        System.out.println("Pi Value is " + Circle.pi);

        Circle circle2 = new Circle(5 );
        // Constructor gets executed separetely for each object,
        // if you have two different objects, how many times the same Constructor will be executed, two different times.

        Circle circle3 = new Circle(7 );

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        /*
Circle{radius=3.5, diamater=7.0, PI=3.14, calcArea=21.98, calcPerimeter=21.98}
Circle{radius=5.0, diamater=10.0, PI=3.14, calcArea=31.400000000000002, calcPerimeter=31.400000000000002}
Circle{radius=7.0, diamater=14.0, PI=3.14, calcArea=43.96, calcPerimeter=43.96}
         */

        //Can you call any statics through the object? yes, because they do share,
        //whatever the class has, they came from class, any class members are shared
        // the objects

/*
        System.out.println(circle1.pi);// call through the object
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
        // not error but it is not wright way, you can call the static members through the class name

*/
        System.out.println(Circle.pi);
        //System.out.println(Circle.radius ); // error, because class can not access object members
        // instance variable can call through the object
    }
}
