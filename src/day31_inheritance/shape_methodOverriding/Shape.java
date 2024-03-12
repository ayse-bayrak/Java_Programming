package day31_inheritance.shape_methodOverriding;

public class Shape {

private String name;

    public Shape() {  // we create default constructor, because there is no common variable other than the name, set variable name as class name
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area() {
        // to decide question: do we have one formula to calculate the area of all shapes?,
        // answer: we don't, so I need to give the default value that needs to be returned from area method. for ex.
        // I can just set it to zero at this moment, but later on, in the child classes, I can change it.
        // I can give the formula that's needed to calculate area in the child class later.
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void draw() {
        System.out.println("Drawing a " + getClass().getSimpleName() + ": ");
        //you should write appropriate code fragment in each subclass
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
