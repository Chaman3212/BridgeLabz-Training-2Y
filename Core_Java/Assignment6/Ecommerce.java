// ECommerce.java
import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String id,String name,double price){
        this.productId = id; this.name = name; this.price = price;
    }
    public String getProductId(){ return productId; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public void setPrice(double price){ this.price = price; }

    public abstract double calculateDiscount(); // override per product
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id,String name,double price){ super(id,name,price); }
    public double calculateDiscount(){ return getPrice() * 0.10; } // 10% off
    public double calculateTax(){ return getPrice() * 0.18; } // 18% GST
    public String getTaxDetails(){ return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id,String name,double price){ super(id,name,price); }
    public double calculateDiscount(){ return getPrice() * 0.20; } // 20% off
    public double calculateTax(){ return getPrice() * 0.05; } // 5%
    public String getTaxDetails(){ return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(String id,String name,double price){ super(id,name,price); }
    public double calculateDiscount(){ return 0; } // no discount
}

public class ECommerce {
    public static void printFinalPrice(Product p){
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;
        System.out.printf("%s final: %.2f (price %.2f tax %.2f disc %.2f)%n",
                p.getName(), finalPrice, p.getPrice(), tax, discount);
    }
    public static void main(String[] args){
        List<Product> items = Arrays.asList(
                new Electronics("E1","Phone",20000),
                new Clothing("C1","Shirt",800),
                new Groceries("G1","Rice",1200)
        );
        for(Product p: items) printFinalPrice(p); // polymorphism
    }
}
