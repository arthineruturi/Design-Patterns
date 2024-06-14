package State;

class ShippedState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void sendNotification(Order order) {
        // Send shipment notification to customer
        System.out.println("Notification: Order shipped.");
    }
}
