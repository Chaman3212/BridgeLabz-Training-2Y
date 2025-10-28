// RideHailing.java
import java.util.*;

abstract class VehicleRH {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRH(String id,String driver,double rate){ this.vehicleId=id; this.driverName=driver; this.ratePerKm=rate; }
    public String getVehicleId(){ return vehicleId; }
    public String getDriverName(){ return driverName; }
    public double getRatePerKm(){ return ratePerKm; }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){ System.out.println(getVehicleId()+" by "+getDriverName()); }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class CarRH extends VehicleRH implements GPS {
    private String location = "Unknown";
    public CarRH(String id,String driver,double rate){ super(id,driver,rate); }
    public double calculateFare(double distance){ return getRatePerKm() * distance; }
    public String getCurrentLocation(){ return location; }
    public void updateLocation(String location){ this.location = location; }
}

class BikeRH extends VehicleRH {
    public BikeRH(String id,String driver,double rate){ super(id,driver,rate); }
    public double calculateFare(double distance){ return getRatePerKm() * distance * 0.75; }
}

class AutoRH extends VehicleRH {
    public AutoRH(String id,String driver,double rate){ super(id,driver,rate); }
    public double calculateFare(double distance){ return getRatePerKm() * distance * 0.85; }
}

public class RideHailing {
    public static void main(String[] args){
        List<VehicleRH> fleet = Arrays.asList(new CarRH("V1","Sam",15), new BikeRH("V2","Ria",10), new AutoRH("V3","Ajay",8));
        double dist = 12.5;
        for(VehicleRH v: fleet){
            System.out.println(v.getClass().getSimpleName() + " fare for " + dist + " km: " + v.calculateFare(dist));
            v.getVehicleDetails();
            if(v instanceof GPS){
                GPS g = (GPS)v;
                g.updateLocation("Downtown");
                System.out.println("Location: " + g.getCurrentLocation());
            }
        }
    }
}
