package day31_inheritance.shape_methodOverriding;

public class Square extends Shape { // I am not getting error, because parent class's constructor default ( no argument)

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw(); // call parent class draw()
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }

    @Override
    public String toString() { // you can design it as you want to look like
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", side=" + side  +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
