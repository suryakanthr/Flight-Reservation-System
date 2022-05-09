

public class Passenger {

    Contact contact;
    Address address;
    Ticket ticket;
    int id;
    private static int idCounter = 0;

    public Passenger(){
        this.contact = new Contact("surya","9578095974","surya@gmail.com");
        this.address = new Address("4th street","Los Angeles","California");
        idCounter++;
        this.id = idCounter;

    }

    public void register(Contact contact, Address address){
        this.contact = contact;
        this.address = address;
    }

    public int getPassengerCount(){
        return  idCounter;
    }

    public void bookTicket(Ticket ticket){
        this.ticket = ticket;
    }

    private static class Contact {
        private String name;
        private String phoneNumber;
        private String emailID;

        public Contact(String name,String phoneNumber,String emailID){
            this.name = name;
            this.phoneNumber= phoneNumber;
            this.emailID =  emailID;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmailID() {
            return emailID;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmailID(String emailID) {
            this.emailID = emailID;
        }

        public String getContactDetails(){
            return name+" "+phoneNumber+" "+emailID;
        }

        public void updateContactDetails(String name,String phoneNumber,String emailID){
            this.name = name;
            this.phoneNumber= phoneNumber;
            this.emailID =  emailID;
        }
    }

    private static class Address {
        String street;
        String city;
        String state;

        public Address(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getAddressDetails(){
            return street+" "+city+" "+state;
        }

        public void updateAddressDetails(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }



}