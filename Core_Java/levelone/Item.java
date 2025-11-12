package levelone;

package com.bridgelabz.oops.levelone;

class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotal(int quantity) {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 50000);
        item.displayItem();
        System.out.println("Total cost for 2 items: " + item.calculateTotal(2));
    }
}
