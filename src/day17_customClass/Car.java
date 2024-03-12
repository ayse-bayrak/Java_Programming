package day17_customClass;

public class Car {
    public String name;
    public String brand;
    public String model;
    public int age;
    public String color;
    public double price;

    public void setInfo(String name, String brand, String model, int age, String color, double price) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void CarInfo() {
        System.out.println(name + " is " + color + " and " + brand + " " + model);
    }
}
