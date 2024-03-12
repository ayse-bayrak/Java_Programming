package day31_inheritance.shape_methodOverriding;

public class TestShapeObject {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();



        System.out.println("===================================");

        Circle circle = new Circle(3.5);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle(4, 10);

        System.out.println(rectangle);

        rectangle.draw();
    }
}
