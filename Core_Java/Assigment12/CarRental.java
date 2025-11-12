package Assigment12;


class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental() {
        this("Unknown", "Sedan", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateCost();
    }

    private void calculateCost() {
        double dailyRate = 1500;
        this.totalCost = rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Raj", "SUV", 5);
        r1.display();
    }
}

