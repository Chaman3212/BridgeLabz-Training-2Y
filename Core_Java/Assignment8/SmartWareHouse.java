package Assignment8;

public class SmartWareHouse {
    abstract class WarehouseItem { String name; WarehouseItem(String n){name=n;} }
    class Electronics extends WarehouseItem { Electronics(String n){super(n);} }
    class Groceries extends WarehouseItem { Groceries(String n){super(n);} }
    class Furniture extends WarehouseItem { Furniture(String n){super(n);} }

    class Storage<T extends WarehouseItem> {
        private List<T> items = new ArrayList<>();
        public void addItem(T item){ items.add(item); }
        public List<T> getItems(){ return items; }
    }

    class WarehouseUtil {
        public static void displayAll(List<? extends WarehouseItem> items) {
            for (WarehouseItem i : items) System.out.println(i.name);
        }
    }

}
