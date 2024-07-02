package coe528.lab1;

/**
 *
 * @author KabisanPararajasingam
 */
public class Ticket {
   //Flight object
    Flight f = new Flight(1030, "Toronto", "Kolkata", "7:50pm", 100, 1000);

    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number;
    
       public Ticket(Passenger p, Flight flight, double price){
        //initialized variables in constructor method
        this.passenger = p;
        this.flight = flight;
        this.price = price;
       }
    public void setPassenger(Passenger p){
        this.passenger = p;
    }
    
    public Passenger getPassenger(){
        return passenger;
    }
    
    public void setFlight(Flight f){
        this.flight = f;
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public void setPrice(double pr){
        this.price = pr;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setNumber(int n){
        this.number = n;
    }
    
    public int getNumber(){
        return number;
    }
    
    //created toString() method to return a sentence for the ticket with correct information
    @Override
    public String toString(){
      return passenger.getName() + " Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() + ", " +  flight.getDepartureTime() + ", original price: " + flight.getOriginalPrice() + "$, ticket price: " + price + "$";  
    }
}



