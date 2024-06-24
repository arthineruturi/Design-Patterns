package State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        
        order.processOrder();
        order.sendNotification(); 

        order.setState(new ShippedState());
        order.processOrder(); 
        order.sendNotification();

        order.setState(new DeliveredState());
        order.processOrder();
        order.sendNotification(); 
    }
}