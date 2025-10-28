package Assignment7;

public class MultiLevelInhertence {
    // Multilevel Inheritance Example
    class Order {
        int orderId;
        String orderDate;

        Order(int orderId, String orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
        }
    }

    class ShippedOrder extends Order {
        String trackingNumber;

        ShippedOrder(int orderId, String orderDate, String trackingNumber) {
            super(orderId, orderDate);
            this.trackingNumber = trackingNumber;
        }
    }

    class DeliveredOrder extends ShippedOrder {
        String deliveryDate;

        DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
            super(orderId, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }

        void getOrderStatus() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Tracking Number: " + trackingNumber);
            System.out.println("Delivered on: " + deliveryDate);
        }
    }

    public class MultilevelInheritanceDemo {
        public static void main(String[] args) {
            DeliveredOrder order = new DeliveredOrder(101, "2025-10-27", "TRK9876", "2025-10-28");
            order.getOrderStatus();
        }
    }

}
