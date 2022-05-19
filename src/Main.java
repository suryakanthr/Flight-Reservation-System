import java.util.*;

public class Main {

    static Map<Integer, Passenger> userDetails = new HashMap<>();
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            
            boolean loop = true;
            
            while(loop){
                System.out.println("---------------------------------------------");
                System.out.println(" Welcome to Flight Ticket reservation system");
                System.out.println("---------------------------------------------");
                System.out.println("1) User registration");
                System.out.println("2) Book ticket");
                System.out.println("3) Check ticket availability");
                System.out.println("4) Check ticket status");
                System.out.println("5) Ticket cancellation");
                System.out.println("0) Exit");
                System.out.println("Enter option to proceed further");
                String input = sc.nextLine();
                int option = Integer.parseInt(input);
                switch(option){
                    case 1:{
                        
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
                        if(userDetails.containsKey(p.id)){
                            System.out.println("User is already registered");
                        }
                        else{
                            userDetails.put(p.id,p);
                            System.out.println("User registered successfully with ID: "+p.id);
                        }
                        
                    } 
                    break;

                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
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
