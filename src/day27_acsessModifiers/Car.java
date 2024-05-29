package day27_acsessModifiers;

public class Car {// outer class
    public String make, model, color;
    public int year;
    public double price;
public static int wheels = 4;

    public class CarEngine{// inner class

        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass {// static only accepts the static members
        public void method() {
            //System.out.println(make);// can not access instance variable, because class is static
            System.out.println(wheels);
        }

    }
}
