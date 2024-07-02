package coe528.lab1;

/**
 *
 * @author KabisanPararajasingam
 */
public abstract class Passenger {
    //Protected because Passenger is a base absteact class and will extend other classes
    protected String name;
    protected int age;
    
    
    public Passenger(String name, int age){
        //initialized instance variables
        this.name = name;
        this.age = age;
    }
public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public int getAge(){
        return age;
    }
    //This is an abstract method which returns price after applying appropriate discount
    public abstract double applyDiscount(double p);
}  



