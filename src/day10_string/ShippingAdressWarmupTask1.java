package day10_string;

import java.util.Scanner;

/*
1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
 */
public class ShippingAdressWarmupTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Enter

        System.out.println("Enter your full name");
        String fullName =input.nextLine(); // Cyde School + Enter

        System.out.println("Enter your building number");
        String buildingNumber =input.next(); // 7925A + Enter // if the next is not going to  take this enter as the enter,
        //then what happens to this. you typed on your keyboard, it will be left in the scanner,
        // next() method is only one that can read the enter but other methods of the scanner they always ignore the enter key

        System.out.println("Enter your Street name");
        input.nextLine();// to clear the scanner,
        // this is used to getting 'enter that get from keyboard as input' (tab character) on scanneer, then scanner is empty..
        String streetName = input.nextLine();// Jones Branch Dr + Enter

        System.out.println("Enter your city name");
        String cityName = input.nextLine();// McLean + Enter

        System.out.println("Enter your state");
        String state = input.nextLine();//VA + Enter

        System.out.println("Enter your zip code");
        String zipCode = input.next();//

        System.out.println("Your shipping address is: \n\t" + fullName + "\n\t" + buildingNumber +
                 ", " + streetName + "\n\t" + cityName + ", "+ state + ", " + zipCode);

    input.close();
    }
}
