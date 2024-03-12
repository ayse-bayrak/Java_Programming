package day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        while(true) {
            pizzas.add(new Pizza('S',3,2));
        }
        //if you create infinite Pizza object add, at some point the memory is full.
        // we will get error like  OutOfMemoryError: Java heap space
        // errors is not exception



    }
}
