package week1revisionex;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Week1RevisionEx {

    Vehicle[] Vehicles = new Vehicle[20];
    private static int max_vehicles = 20;
    private static int max_weight = 30000;
    
    public static void main(String[] args) {
       
    }
    public int GetWeight() {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        int car_weight = Integer.parseInt(scanIn.nextLine());
        return car_weight;
    }
    public String GetReg() {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter the reg: ");
        String reg = scanIn.nextLine();
        return reg;
    }
    public Double calcTotalWeight() {
        Double Tweight = 0.00;
        Double Totalweight = 0.00;
        for (int i=0; i<Vehicles.length; i++){
            if(Vehicles[i] != null){
                Tweight = Vehicles[i].GetWeight();
            }
            Totalweight = Totalweight + Tweight;
        }
        return Totalweight;
    }

    public boolean requestAddVechicle(Vehicle vehicle) {
        if (Vehicles.length >=max_vehicles){
            return false;
        }
        
        if (GetWeight() + calcTotalWeight() >= max_weight){
            return false;
        }
        return true;
    }

    public boolean removeVehicle(String registration) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int numberOfVehicles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double calcTotalCost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
