package week1revisionex;

public abstract class Vehicle {
    
    protected Double weight;
    
    private String registration;
    
    public abstract Double calculateFee();
    
    public Double GetWeight() {
        return weight;
    }
    
    public String getRegistration() {
        return registration;
    }
            
}
