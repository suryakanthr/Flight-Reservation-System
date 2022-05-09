public class Flight {
    private int flightNumber;
    String airline;
    int flightCapacity;
    int seatsBooked;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(int flightNumber, String airline, int flightCapacity, int seatsBooked){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.flightCapacity=flightCapacity;
        this.seatsBooked=seatsBooked;
    }

    public void getFlightDetails(){
        System.out.println("Flight number: "+flightNumber);
        System.out.println("Airline: "+airline);
        System.out.println("Flight capacity: "+flightCapacity);
        System.out.println("Number of seats booked: "+seatsBooked);
    }

    public int checkSeatAvailability(){
        return flightCapacity - seatsBooked;
    }

    public void updateSeatAvailability(){
        this.seatsBooked+=1;
    }

}