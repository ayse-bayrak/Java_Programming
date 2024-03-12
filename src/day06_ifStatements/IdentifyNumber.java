package day06_ifStatements;
/*
Create a class named IdentifyNumber, and write a program that can identify
if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;
        boolean isPozitive= number>0;// if the number is greater than zero then it is a pozitive number
        boolean isNegative= number <0;// if the number is less than zero then it is negative number
        //boolean isZero= number ==0;//if the number is equal to zero, then it is zero
        boolean isZero= !isPozitive && !isNegative; // if the number is NOT pozitive AND not negative. then it's zero


        System.out.println(number+ "is positive number: " +isPozitive);
        System.out.println(number+ "is negative number: " +isNegative);
        System.out.println(number+ "is zero: " +isZero);
    }
}
