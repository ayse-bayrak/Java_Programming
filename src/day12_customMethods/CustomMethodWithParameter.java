package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {


        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);


        int num3 = 79;
        oddOrEven(num3);


        int num4 = 39;
        oddOrEven(num4);

        System.out.println("========================================");
        int age= 24;
        eligibleAlcohol(age);

        int number = 25;
        evenOddZero(number);

        int score = 100;
        displayGrade(score);

        int number1 = 25;
        int number2 = 37;
        maxNumber(number1, number2);

        String firsName ="ayse";
        String lastName ="gunesbayrak";
        initialPerson(firsName, lastName);
    }

    // strongly recommended, take a command on top of the method what's functionality of this method
    // the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number){
        if(number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }



    // create a method that can check if a person is eligible to buy alcohol  (age)
        public static void eligibleAlcohol (int age) {

        if (age>=19){
            System.out.println("You are eligibile to buy alcohol");
        }else {
            System.out.println("Yor are not eligible to buy alcohol");
        }

        }

    // create a method that can check if a number is odd, or even or zero (number)

        public static void evenOddZero (int number) {

        if (number==0){
            System.out.println(number + " is " + "zero" );
        }else if (number%2==0){
            System.out.println(number + " is "+ "even" );
        }else {
            System.out.println(number + " is "+ "odd");
        }
        }

    // create a method that can calculate the grade of the students  (score)

    public static void displayGrade(int score) {

       char grade = (score>=90)? 'A': (score>=80)? 'B': (score>=70)? 'C': (score>=60)? 'D' : 'F';
        System.out.println("Grade is "+ grade);

    }

    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)

    public static void maxNumber(int number1, int number2) {

        if (number1>number2) {
            System.out.println(number1 + " is maximum number ");
        }else if (number2>number1){
            System.out.println(number2 + " is maximum number ");
        }else {
            System.out.println("Equal");
        }

    }

    //Create a method that can display the initials of a person  (firstName, lastName)

    public static void initialPerson (String firstName, String lastName) {

        String initial=firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        System.out.println(initial);
    }
        /*
        firstname = "Cydeo"
        lastname = "School"


        initial ==> C.S
         */




}