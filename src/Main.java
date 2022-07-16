import java.util.*;

import javax.lang.model.util.ElementScanner14;

//

public class Main {

    static Map<Integer, Passenger> userDetails = new HashMap<>();
    static Map<Integer, Ticket> ticketDetails = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            boolean loop = true;

            while (loop) {
                System.out.println("---------------------------------------------");
                System.out.println(" Welcome to Flight Ticket reservation system");
                System.out.println("---------------------------------------------");
                System.out.println("1) User registration");
                System.out.println("2) Book ticket");
                System.out.println("3) Check ticket details");
                System.out.println("4) Check ticket availability");
                System.out.println("5) Ticket cancellation");
                System.out.println("0) Exit");
                System.out.println("Enter option to proceed further");

                int option = sc.nextInt();
                //int option = Integer.parseInt(sc.nextLine());
                sc.nextLine();

                switch (option) {
                    case 1: {

                        System.out.println("Enter your name");
                        String name = sc.nextLine();

                        System.out.println("Enter your emailID");
                        String emailId = sc.nextLine();

                        System.out.println("Enter your contact number");
                        String contactNumber = sc.nextLine();

                        System.out.println("Enter your street details");
                        String street = sc.nextLine();

                        System.out.println("Enter your City");
                        String city = sc.nextLine();

                        System.out.println("Enter your State");
                        String state = sc.nextLine();

                        Passenger p = new Passenger(name, emailId, contactNumber, street, city, state);
                        if (userDetails.containsKey(p.id)) {
                            System.out.println("User is already registered");
                        } else {
                            userDetails.put(p.id, p);
                            System.out.println("User registered successfully with ID: " + p.id);
                        }

                    }
                        break;

                    case 2:
                        System.out.println("Please enter your registration ID");
                        int checkID = sc.nextInt();
                        //int checkID = Integer.parseInt(sc.nextLine());
                        if (!userDetails.containsKey(checkID))
                            System.out.println("Kindly register your details to book tickets");
                        else {
                            System.out.println("1) Book regular ticket");
                            System.out.println("2) Book tourist ticket");
                            sc.nextLine();
                            int ticketType = sc.nextInt();
                            if (ticketType == 1) {
                                System.out.println("Enter the following details");
                                System.out.print("Departure location");
                                sc.nextLine();
                                String departureLocation = sc.nextLine();
                                System.out.print("Destination location");
                                String destinationLocation = sc.nextLine();
                                System.out.print("Departure date in dd/mm/yyyy");
                                String departureDate = sc.nextLine();
                                System.out.print("Enter number of tickets");
                                int noOfTickets = sc.nextInt();

                                RegularTicket regTkt = new RegularTicket(departureLocation, destinationLocation,
                                        departureDate, noOfTickets, userDetails.get(checkID));
                                System.out.println(noOfTickets + " regular tickets booked successfully");
                                ticketDetails.put(checkID,regTkt);
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Please enter your registration ID");
                        int ticketCheckID = sc.nextInt();
                        if(!ticketDetails.containsKey(ticketCheckID))
                            System.out.println("No tickets booked from this userID");
                        else{
                            System.out.println("Departure Location: "+ticketDetails.get(ticketCheckID).departureLocation);
                            System.out.println("Destination Location: "+ticketDetails.get(ticketCheckID).destinationLocation);
                            System.out.println("Number of tickets booked: "+ticketDetails.get(ticketCheckID).flight.ticketsCount);
                            System.out.println("Departure Date: "+ ticketDetails.get(ticketCheckID).departureDate);
                            ticketDetails.get(ticketCheckID).checkTicketStatus();
                            
                        }
                        break;
                    case 4:
                        System.out.println(ticketDetails.get(1).flight.checkSeatAvailability());
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 0:
                        loop = false;
                        break;
                    default:
                        System.out.println("Kindly enter a valid option");
                }
            }
        }

    }
}
