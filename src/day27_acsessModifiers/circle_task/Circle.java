package day27_acsessModifiers.circle_task;

public class  Circle {

    public double radius, diamater; // d = 2r;
    public static double pi = 3.14;// there is only one value, which means
    // you just need to initialize it one time for all the objects.


    //To set the instance variables, we will need a Constructor. Because instance means
    // each object will have separate copy of radius and diameter.
    // So we need to set the radius and diameter separately for each of the object and Constructor gets executed every time when you create object
    public Circle(double radius) { // you should analyze how many arguments, or must in order to set all the instance variables.
        this.radius = radius;
        //we are calling the instance variable, we will send this Constructor, we still have a local variable radius.
        // whenever the local variable is having the same name, as the instance variable in order to call the instance variable,
        //then you will have used the this. keyword.

        this.diamater = 2 * radius;//otherwise you don't have to
    }
    // static only accepts the statics, and we have different area,  so we need to use instance method, and
    public double calcArea() { //returns the area of the circle, we may use it in other places later, such as in toString method
        return pi * diamater;
    }
    /*
    Why instance methods accept both static and instance and static accepts only static?

    Instance is object member, belong to object.
    Static is class member belong to class.

    Can class whatever the object has, no, classes can not share the object members.
    All the objects came from class, so whatever the class has all the objects
     */
    public double calcPerimeter() { //returns the perimeter of Circle, 2πr
        return diamater*pi; // 2*radius*pi
    }
    public static void displayPi(){ // we don't use any instance variables or instance methods so we create static method
        // it is better for us beause we can call just throuhh the class name, it is easier
        System.out.println("PI value is:  " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diamater=" + diamater +
                ", PI=" + pi +
                ", calcArea=" + calcArea() +
                ", calcPerimeter=" + calcPerimeter() +
                '}';
    }


}
/*
2. Circle Task:
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of the circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays the PI value
					toString(): displays the radius, diameter, pi, area, and perimeter of the circle when the object of a circle is passed in the print statement
 */