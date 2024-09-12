
package ansali.it2b;
    import java.util.Scanner;

public class ANSALIIT2B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Orders: ");
        int numberOfOrders = Integer.parseInt(sc.nextLine());

        Order[] orders = new Order[numberOfOrders];

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("Enter details of order " + (i + 1) + ":");

            System.out.print("Order ID: ");
            int orderId = Integer.parseInt(sc.nextLine());

            System.out.print("Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Order Date: ");
            String orderDate = sc.nextLine();

            System.out.print("Order Amount: ");
            double orderAmount = Double.parseDouble(sc.nextLine());

            System.out.print("Order Status: ");
            String orderStatus = sc.nextLine();

            orders[i] = new Order(orderId, customerName, orderDate, orderAmount, orderStatus);
            OrderValidator.validateOrder(orders[i]);
        }

        System.out.println("Order ID\tCustomer Name\tOrder Date\tOrder Amount\tOrder Status");
        for (Order order : orders) {
            System.out.println(order.orderId + "\t\t" + order.customerName + "\t\t" + order.orderDate + "\t" + order.orderAmount + "\t\t" + order.orderStatus);
        }

        sc.close();
    }
}