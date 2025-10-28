// VehicleRental.java
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    public Vehicle(String num,String type,double rate){
        this.vehicleNumber = num; this.type = type; this.rentalRate = rate;
    }
    public String getVehicleNumber(){ return vehicleNumber; }
    public String getType(){ return type; }
    public double getRentalRate(){ return rentalRate; }
    public void setRentalRate(double r){ rentalRate = r; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNo;
    public Car(String num,double rate,String policy){ super(num,"Car",rate); this.policyNo = policy; }
    public double calculateRentalCost(int days){ return getRentalRate() * days; }
    public double calculateInsurance(){ return 1500; }
    public String getInsuranceDetails(){ return "Policy: " + policyNo; }
}

class Bike extends Vehicle {
    public Bike(String num,double rate){ super(num,"Bike",rate); }
    public double calculateRentalCost(int days){ return getRentalRate() * days * 0.6; } // cheaper
}

class Truck extends Vehicle implements Insurable {
    private String policyNo;
    public Truck(String num,double rate,String policy){ super(num,"Truck",rate); this.policyNo = policy; }
    public double calculateRentalCost(int days){ return getRentalRate() * days * 1.5; } // higher
    public double calculateInsurance(){ return 5000; }
    public String getInsuranceDetails(){ return "Policy: " + policyNo; }
}

public class VehicleRental {
    public static void main(String[] args){
        List<Vehicle> fleet = Arrays.asList(
                new Car("KA01A001",2000,"C-1234"),
                new Bike("KA01B002",500),
                new Truck("KA01T003",5000,"T-987")
        );
        for(Vehicle v: fleet){
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " cost for 3 days: " + v.calculateRentalCost(3));
            if(v instanceof Insurable){
                Insurable ins = (Insurable)v;
                System.out.println("Insurance: " + ins.calculateInsurance() + ", " + ins.getInsuranceDetails());
            }
        }
    }
}
