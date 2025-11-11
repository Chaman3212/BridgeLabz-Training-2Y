package Assignment8;

public class PriceCalculator {
    class Product {
        private double price;
        public Product(double price) { this.price = price; }
        public double getPrice() { return price; }
    }

    class Mobile extends Product { public Mobile(double price) { super(price); } }
    class Laptop extends Product { public Laptop(double price) { super(price); } }

    class PriceUtil {
        public static double calculateTotal(List<? extends Product> items) {
            double total = 0;
            for (Product p : items) total += p.getPrice();
            return total;
        }
    }

}
