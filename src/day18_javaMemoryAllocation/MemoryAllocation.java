package day18_javaMemoryAllocation;

import day17_customClass.Employee;

class Car{

    public String brand;
    public String model;
    public String color;
    public int year;

}
public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // stack

        Car car   =  new Car();
        //  stack      heap


        System.out.println("-----------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;// multiple reference name and we can just create one object
                                // which will be allocated in the Heap
        String batch3 = batch1;

        // those reference variables are allocated in the STACK.
        // This object is allocated in the HEAP.

    }

    public static void method1(){

        int b = 200; // stack

    }

    public static void method2(){

        String  c  =  "Hello World";
        //    stack       heap (String Pool)

        String  d   =  new String("Hello World") ;
        //     stack         heap
    }



}
