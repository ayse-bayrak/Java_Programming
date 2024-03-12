package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args)  {

        System.out.println("Enter your age: ");

        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age > 150){
            if(age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: "+age);
            }else{
                throw new InputMismatchException("Age of the person can not be greater than 150: "+age);
            }
        }

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------------------------");

        // throw new RuntimeException("Runtime exception");
        // System.out.println("Hello World");


        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------------");

        RuntimeException exception = new RuntimeException();

        // throw exception;
        // throw new RuntimeException();

        // throw new Person("Jimmy", 45, 'M');
        // when you use the throw keyword, it only works with the classes of the object that you have that has is a relationship with throwable
        // it is a child class of runtime exception, it has its relationship with runtime exception.
        // it has to be an exception,
    }
}
/*
Only purpose for using the throw keyword is to crash the program,if you have some conditions to crash the program,
then you could use the throw keyword under the if statement.
 */