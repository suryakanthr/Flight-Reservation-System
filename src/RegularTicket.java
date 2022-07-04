

public class RegularTicket extends Ticket {
    String food;
    String water;
    String snacks;
    boolean isAvailed = false;

    public RegularTicket(String departureLocation, String destinationLocation, String departureDate, int noOfTickets, Passenger passenger ) {
        super(departureLocation, destinationLocation, departureDate, noOfTickets, passenger);
    }
 
    public void checkSpecialServicesAvailed(){
        if(isAvailed==false){
            System.out.println("No special services has been availed");
        }
        else{
            System.out.println("Food: "+food);
            System.out.println("Water: "+water);
            System.out.println("Snacks"+snacks);
        }
    }

    public void updateSpecialServicesAvailed(String food, String water, String snacks){
        this.food=food;
        this.water=water;
        this.snacks=snacks;
    }

    @Override
    public void printTicketDetails(){
        System.out.println("PNR number of regular ticket is: "+this.getPnrNumber());
    }


}