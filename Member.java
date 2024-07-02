package coe528.lab1;

/**
 *
 * @author KabisanPararajasingam
 */
public class Member extends Passenger {
    private final int yearsOfMembership;
    
    public Member(String name, int age, int years){
        super(name, age);
        this.yearsOfMembership = years;
    }
    @Override
    public double applyDiscount(double p){
        
        if (yearsOfMembership > 5) {
            return p - p * 0.5;
        }
        
        else if (yearsOfMembership > 1 || yearsOfMembership <= 5) {
            return p - (p * 0.1);
        }
        else {
            return p;
        }
    }
}
