package day38_exceptions.shapeTask;

public class TestShapeObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
       // circle1.setRadius(0);//InvalidShapeException: Radius of the circle can not be negative or zero: 0.0
        circle1.setRadius(-5);//InvalidShapeException: Radius of the circle can not be negative or zero: -5.0

    }
}
