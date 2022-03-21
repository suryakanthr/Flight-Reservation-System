public class TouristTicket extends Ticket  {
    private String hotelName;
    String hotelStreet;
    String hotelCity;
    String[] touristLocations = new String[5];
    public final int touristlist = 5;

    public TouristTicket(String  pnrNumber, String departureLocation, String destinationLocation, Flight flight, String departureTime, String arrivalTime, String departureDate, String arrivalDate, Passenger passenger, int seatNumber, float price, boolean isCancelled) {
        super(pnrNumber, departureLocation, destinationLocation, flight, departureTime, arrivalTime, departureDate, arrivalDate, passenger, seatNumber, price, isCancelled);
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String[] addTouristLocation(String newLocation){
        if(touristLocations[4]!=null){
            for(int i=0;i<touristlist-1;i++){
                if(touristLocations[i]==null){
                    touristLocations[i]=newLocation;
                }
            }
        }
        else{
            System.out.println("Maximum tourist locations added");
        }
        return touristLocations;
    }

    public String[] removeTouristLocation(){
        if(touristLocations[0]!=null){
            for(int i=touristlist-1;i>=0;i--){
                if(touristLocations[i]!=null){
                    touristLocations=null;
                    break;
                }
            }
        }
        return touristLocations;
    }

    public void printTicketDetails(){
        System.out.println("PNR number of tourist ticket is: "+this.getPnrNumber());
    }


}
