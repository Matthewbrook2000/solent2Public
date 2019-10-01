package week1revisionex;

public class Car extends Vehicle{
     
    @Override
    public Double calculateFee() {
        Integer Maxweight = 1590;
        Double fee = 5.00;
        do {
            Maxweight = Maxweight + 100;
            fee = fee + 0.1;
        } while(weight > Maxweight);
        return fee; 
    }
    
}
