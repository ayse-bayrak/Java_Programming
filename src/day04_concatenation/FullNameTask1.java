package day04_concatenation;
/*
1. Create a class named FullName.java
2. Declare the following variables:
1. firstName
2. lastName

3. Use concatenation to print the full name
Ex:
Your full name is Daniel Jefferson
 */
public class FullNameTask1 {
    public static void main(String[] args) {
    String firstName="Daniel",
            lastName="Jefferson",
            fullName=firstName + " " + lastName;

        System.out.println("Your full name is "+ fullName);
        System.out.println("Your full name is "+ firstName + " " + lastName);

    }
}
