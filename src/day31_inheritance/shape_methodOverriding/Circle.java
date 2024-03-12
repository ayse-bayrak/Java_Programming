package day31_inheritance.shape_methodOverriding;

public class Circle extends Shape {

private double radius;
public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("");
        // code fragments that can draw a circle
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", radius=" + radius +
                '}' ;
    }
}
