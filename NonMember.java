package coe528.lab1;

/**
 *
 * @author User
 */
public class NonMember extends Passenger {
    
    public NonMember(String name, int age) {
        super(name, age);
    }
    @Override
    public double applyDiscount(double p){
        if(age > 65){
            return p - p * 0.1;
        }
        else{
            return p;
        }
    }
}
