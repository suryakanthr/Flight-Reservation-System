abstract class  Ticket {
    private String pnrNumber;
    String departureLocation;
    String destinationLocation;
    Flight flight;
    String departureTime;
    String arrivalTime;
    String departureDate;
    String arrivalDate;
    private Passenger passenger;
    int seatNumber;
    float price;
    boolean isCancelled = false;

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket(String pnrNumber, String departureLocation, String destinationLocation, Flight flight, String departureTime,
                  String arrivalTime, String departureDate, String arrivalDate, Passenger passenger, int seatNumber, float price, boolean isCancelled){
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = new Flight(3461,"Indigo",80,35 );
        this.departureTime = departureTime;
        this. arrivalTime = arrivalTime;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isCancelled = isCancelled;
    }

    public void checkTicketStatus(){
        if(isCancelled == false){
            System.out.println("The ticket has been confirmed");
        }
        else{
            System.out.println("The ticket has been cancelled");
        }
    }

    public String journeyDuration(){
        return "___ Days ___ Hours ___Minutes";
    }

    public void cancelTicket(){
        isCancelled = true;
        System.out.println("The ticket has been cancelled successfully");
    }

    abstract void printTicketDetails();



}