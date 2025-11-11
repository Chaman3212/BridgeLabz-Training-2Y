package Assignment9;
import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }

    public String toString() {
        return name + " - ₹" + price + ", ⭐" + rating + ", " + discount + "% off";
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Phone", 15000, 4.5, 10),
                new Product("Laptop", 55000, 4.8, 15),
                new Product("Headphones", 2000, 4.2, 25)
        );

        List<Product> byPrice = new ArrayList<>(products);
        byPrice.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:");
        byPrice.forEach(System.out::println);

        List<Product> byRating = new ArrayList<>(products);
        byRating.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        byRating.forEach(System.out::println);

        List<Product> byDiscount = new ArrayList<>(products);
        byDiscount.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        byDiscount.forEach(System.out::println);
    }
}

