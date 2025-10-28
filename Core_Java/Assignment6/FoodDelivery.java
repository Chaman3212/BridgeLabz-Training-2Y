// FoodDelivery.java
import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name,double price,int qty){ this.itemName=name; this.price=price; this.quantity=qty; }
    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }
    public void setQuantity(int q){ this.quantity = q; }
    public abstract double calculateTotalPrice();
    public void getItemDetails(){ System.out.println(itemName + " x" + quantity + " -> " + calculateTotalPrice()); }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name,double p,int q){ super(name,p,q); }
    public double calculateTotalPrice(){ return getPrice() * getQuantity() - applyDiscount(); }
    public double applyDiscount(){ return getPrice()*getQuantity()*0.05; } // 5%
    public String getDiscountDetails(){ return "5% veg discount"; }
}

class NonVegItem extends FoodItem {
    private double nonVegCharge = 20; // per item extra
    public NonVegItem(String name,double p,int q){ super(name,p,q); }
    public double calculateTotalPrice(){ return (getPrice() + nonVegCharge) * getQuantity(); }
}

public class FoodDelivery {
    public static void main(String[] args){
        List<FoodItem> order = Arrays.asList(new VegItem("Paneer",150,2), new NonVegItem("Chicken",200,1));
        double total = 0;
        for(FoodItem f: order){ f.getItemDetails(); total += f.calculateTotalPrice(); }
        System.out.println("Order total: " + total);
    }
}
