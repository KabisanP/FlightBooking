package coe528.lab1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author KabisanPararajasingam
 */
public class Manager {
    //created a arraylist to store all flights and tickets
     ArrayList<Ticket> ticketList = new ArrayList<>();
     ArrayList<Flight> flightList = new ArrayList<>();
    //created a creatFlights() method 
    public void createFlights(){
        
        //hardcoded multiple object which are flights that have been created
         Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);
         Flight a = new Flight(1020, "Toronto", "Vancouver", "10:00pm", 230, 500);
         Flight b = new Flight(1010, "California", "Vancouver", "5:35pm", 150, 1000);
         Flight c = new Flight(1000, "Toronto", "Calgary", "8:00pm", 25, 200);
         Flight d = new Flight(900, "Vancouver", "New York", "3:00pm", 30, 350);
        
         //this code adds each object (flights) to the arraylist
         flightList.add(f);
         flightList.add(a);
         flightList.add(b);
         flightList.add(c);
         flightList.add(d);
         
    }
    
    //created displayAvailableFlights() method to display flights
    public void displayAvailableFlights(String origin, String destination){
        //created boolean expression to check if a flight has been found
        boolean hasFlight = false;
        //for loop runs through the arraylist of flights
        for(int i = 0; i < flightList.size(); i++){
            //sets currentFlight to the current index it is on
            Flight currentFlight = flightList.get(i);
            
            // if the currentFlight has seat left in it, and its origin/destination equals the 
            //origin/destination the user inputs, then this prints out all the flight information.
            //It also makes the boolean expression true as a flight has been found
            if(currentFlight.getNumberOfSeatsLeft() > 0 && currentFlight.getOrigin().equalsIgnoreCase(origin) && currentFlight.getDestination().equalsIgnoreCase(destination)){
             
                System.out.println(currentFlight.toString());
                hasFlight = true;
            }
            
            
           
        }
        //if the boolean expression is false, then the it prints out a statement of "flight not found"
        if(!hasFlight){
            System.out.println("Flight not found\n");
        }
        
       
       
    }
    //created getFlight() method to get flight number
    public Flight getFlight(int flightNumber){
        //for loop loops through the arryalist
        for(int i = 0; i < flightList.size(); i++){
            //the current index of the for loop is stored in currentFlight 
            Flight currentFlight = flightList.get(i);
            //checks if the flight number entered by user matches any of the flight numbers in the arraylist
            if(currentFlight.getFlightNumber() == flightNumber){
                //If there is a match then it returns the flight information
                return currentFlight;
            }
        }
        //if no flight is found it return null
        return null;
   }
    
    //created method called bookSeat() to allow user to book a seat
    public void bookSeat(int flightNumber, Passenger P){
        //created a object s with parameter of flightNumber
       Flight s = getFlight(flightNumber);
            //if s is null than the flight cannot be found
            if(s == null){
                System.out.println("Cannot find flight\n");
            }
            
            //if there is a flight then the appropriate discount is applied
            //as well as the ticket is created. Then it adds the issued
            // ticket to the arraylist and prints out the users ticket
            
            else{
                if(s.bookASeat() == true){
                    double price = P.applyDiscount(s.getOriginalPrice());
                    Ticket ticket = new Ticket(P, s, price);
                    ticketList.add(ticket);
                    System.out.println("Ticket: " + ticket);
                }
                
                //if there is a flight that existed but its seats got fully booked
                //then this message below appears.
                else{
                    System.out.println("Sorry, Flight is fully booked");
                }
            }
    }
    
    //main method to operate all other methods and classes
    public static void main(String[] args){
        //created two seperate scanners so it lags less. One for intergers and one for strings
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner (System.in);
        //created manager object
        Manager m = new Manager();
        
        //gets the created flights so this method has access to them
        m.createFlights();
        int input = 0;
        
        //created while loop so user can keep using program until they click exit.
        while(input != 3){
        //Gets user input for what option they want to select
        System.out.print("1. Check Available Flights\n2. Book a seat\n3. Exit\n");
        input = scInt.nextInt();
        
            //if user selects option 1 they are asked for an origin and destination.
            //Those variables are stored and are used in diisplayAvailableFlights method.
            if(input == 1){
                System.out.println("What is your origin");
                String origin = scStr.nextLine();
                System.out.println("What is your destination");
                String destination = scStr.nextLine();
                m.displayAvailableFlights(origin, destination);
            
            
            }
        //if user inputs option 2 they are able to book a seat. It asks user to enter flight number,
        //name, and age and stores them as variables.
         else if(input == 2){
            System.out.println("Enter Flight Number: ");
            int flightNum = scInt.nextInt();
            
            System.out.println("Enter name: ");
            String name = scStr.nextLine();
            
            System.out.println("Enter age: ");
            int age = scInt.nextInt();
            
            //asks if user is a member
            System.out.println("Are you a member (yes/no)? ");
            String answer = scStr.nextLine();
            
            //if user is a member it asks how many years they have been a member.
            //This is because an appropriate dscount can be applied according to there
            // age and years of membership. The fliight number and member object is 
            //then sent to the bookSeat method.
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("How many years have you been a member?");
                int years = scInt.nextInt();
                Member member = new Member(name, age, years);
                
                m.bookSeat(flightNum, member);
            }
            
            //if user is not a member then it sends information it creates 
            //a NonMemeber object and sends the variables to bookSeat.
            else if(answer.equalsIgnoreCase("no")){
                NonMember nonMember = new NonMember(name, age);
                m.bookSeat(flightNum, nonMember);
            }
            //if the user does not type yes or no then a print statement
            //of "invalid answer" is printed.
            else{
                System.out.println("Invalid answer");
            }
            
        }
     }
      
        
        
    } 
}
