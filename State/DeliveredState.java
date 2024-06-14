package State;

class DeliveredState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void sendNotification(Order order) {
        // Send delivery confirmation to customer
        System.out.println("Notification: Order delivered.");
    }
}
