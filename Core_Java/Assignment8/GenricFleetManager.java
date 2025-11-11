package Assignment8;

public class GenricFleetManager {
    class Vehicle { String name; Vehicle(String name){this.name=name;} }
    class Truck extends Vehicle { Truck(String name){super(name);} }
    class Bike extends Vehicle { Bike(String name){super(name);} }

    class FleetManager<T extends Vehicle> {
        private List<T> vehicles = new ArrayList<>();

        public void addVehicle(T v) { vehicles.add(v); }
        public void showFleet() {
            for (T v : vehicles) System.out.println(v.name);
        }
    }

}
