package day31_inheritance.shape_methodOverriding;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public void draw() {
        super.draw();

    // code fragment draw rectangle shape

    }

    @Override
    public String toString() {
        return super.toString().toString().replace("}", "")
                +  ", width=" + width +
                ", length=" + length + '}';
    }

}
