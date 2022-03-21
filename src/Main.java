public class Main {
    public static void main(String[] args){

        //Checkpoint-2: Able to create classes, access their attributes, print their values
        //Contact contact = new Contact("surya","9578095974","surya@gmail.com");
        //System.out.println(contact.name);
        //The above two lines throws error as Contact class has been nested inside Passenger class and made private

        //Checkpoint-3:
        Flight flight = new Flight(4577,"Indigo",100,42);
        //System.out.println(flight.flightNumber); //Unable to access private attribute of flight class
        System.out.println("The flight number is: "+flight.getFlightNumber());// Able to access via getter & setter methods

        //Checkpoint-5:
        Passenger passenger = new Passenger();
        RegularTicket regularTicket = new RegularTicket("5846","Los Angeles","Delhi",flight,"6:00 PM","11:00 AM",
                                                         "02/02/2022","03/02/2022",passenger,5,60000.00f,false);
        TouristTicket touristTicket = new TouristTicket("3745","Los Angeles","Delhi",flight,"6:00 PM","11:00 AM",
                "02/02/2022","03/02/2022",passenger,5,60000.00f,false);

        printTicketDetails(regularTicket);  //Printing PNR of regular ticket
        printTicketDetails(touristTicket);  //Printing PNR OF tourist ticket

    }

    public static void printTicketDetails(Ticket regularTicket){
        regularTicket.printTicketDetails();
    }
}
