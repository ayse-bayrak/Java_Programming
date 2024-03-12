package day04_concatenation;

import java.sql.SQLOutput;

/*
1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode

3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030
 */
public class ShippingAddressTask3 {
    public static void main(String[] args) {
        String name= "Aaron Kissinger";
        String buildingNumber="13621A";
        String streetName = "Legasy Circle";
        String city="Fairfax";
        String state="VA";
       int zipCode=22030;


        System.out.println("Your Shipping adress is: \n\t"+name+"\n\t"+buildingNumber+" "
                +streetName+"\n\t" +city+", "+ state + " "+ zipCode);
System.out.println("-----------Muhtars other solution---------");
        System.out.println("Your Shipping adress is: ");
        System.out.println("\t"+name);
        System.out.println("\t"+buildingNumber+" "+streetName);
        System.out.println("\t"+city+","+state+" "+zipCode);

        System.out.println("---------------------");
    }
}
