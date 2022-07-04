public class Flight {
    // private int flightNumber;
    // String airline;
    int flightCapacity = 100;
    int seatsAvailable = 100;
    int seatsBooked = 0;
    int ticketsCount;

    // public int getFlightNumber() {
    //     return flightNumber;
    // }

    // public void setFlightNumber(int flightNumber) {
    //     this.flightNumber = flightNumber;
    // }

    public Flight(int noOfTickets){
        //this.flightNumber=flightNumber;
        //this.airline=airline;
        this.ticketsCount = noOfTickets;
        updateSeatAvailability();
    }

    public void getFlightDetails(){
        // System.out.println("Flight number: "+flightNumber);
        // System.out.println("Airline: "+airline);
        System.out.println("Flight capacity: "+flightCapacity);
        System.out.println("Number of seats booked: "+seatsBooked);
    }

    public int checkSeatAvailability(){
        return seatsAvailable;
    }

    public void updateSeatAvailability(){
        seatsBooked += ticketsCount;
        seatsAvailable -= ticketsCount;
    }

}