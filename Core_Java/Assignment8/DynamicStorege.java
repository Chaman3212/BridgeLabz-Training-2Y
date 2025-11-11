package Assignment8;

public class DynamicStorege {
    class Product<T> {
        String name; double price; T category;
        Product(String n, double p, T c){ name=n; price=p; category=c; }
    }

    class DiscountUtil {
        public static <T extends Product<?>> void applyDiscount(T product, double percent) {
            System.out.println("Discount " + percent + "% applied on " + product.name);
        }
    }

}
