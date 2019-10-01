package week1revisionex;

public class Lorry extends Vehicle {
    
    @Override
    public Double calculateFee() {
        Double fee = 10.00;
        if (weight > 8000) {
            fee = 15.00;
        }
        return fee;
    }
    
}
