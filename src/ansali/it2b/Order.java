
package ansali.it2b;
 import java.util.Scanner;

class Order {
    int orderId;
    String customerName;
    String orderDate;
    double orderAmount;
    String orderStatus;

    public Order(int orderId, String customerName, String orderDate, double orderAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }
}

class OrderValidator {

    public static void validateOrder(Order order) {
        
        if (order.orderAmount < 0) {
            order.orderStatus = "Invalid Amount";
        }
    }
}