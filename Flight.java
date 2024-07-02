package coe528.lab1;

/**
 *
 * @author KabisanPararajasingam
 */
public class Flight {
    //instance variables
    public int flightNumber, capacity, numberOfSeatsLeft;
    public String origin, destination, departureTime;
    public double originalPrice;
    
    //constructor that initializes 6 variables but not numberOfSeatsLeft because that is initailized depending on hte specified capacity
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
        
        //illegalargumentexception to abort the construction if origin and destination are equal
        if (origin.equals(destination)) {
            throw new IllegalArgumentException(" destination cannot equal origin");
        }
        
}
    //Getters anf setter for each variable
    public void setFlightNumber(int flightNum){
        this.flightNumber = flightNum;
    }
    
    public int getFlightNumber(){
        return flightNumber;
    }
    
    public void setOrigin(String orgn){
        this.origin = orgn;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public void setDestination(String destn){
        this.destination = destn;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public void setDepartureTime(String departTime){
        this.departureTime = departTime;
    }
    
    public String getDepartureTime(){
        return departureTime;
    }
    
    public void setCapacity(int cap){
        this.capacity = cap;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setNumberOfSeatsLeft(int numOfSeatsLeft){
        this.numberOfSeatsLeft = numOfSeatsLeft;
    }
    
    public int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    public void setOriginalPrice(double orgnPrice){
        this.originalPrice = orgnPrice;
    }
    
    public double getOriginalPrice(){
        return originalPrice;
    }
    
    //bookASeat method
    public boolean bookASeat(){
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        }
        else {
            return false;
        }
    }
    
     // Override calsss overrides the toString method and returns String represetation of the Flight object including all the info
    @Override
    public String toString(){
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original price: " + originalPrice + "$";  
    }

}

