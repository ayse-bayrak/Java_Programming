package day04_concatenation;
/*
1. Create a class named FlightTicket.java
2. Declare the following variables:
1. from
2. to
3. ticketPrice

3. Use concatenation to print the full ticket information
Ex:
From Las Vegas to McLean is $425.5
 */
public class FlightTicketTask2 {
    public static void main(String[] args) {
        String from= "Las Vegas";
        String to="Mclean";
        double  ticketPrice=425.5;

        System.out.println("From "+from+" to "+to+" is $ "+ticketPrice);

    }
}
