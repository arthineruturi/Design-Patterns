package State;

class ReceivedState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing order...");
        order.setState(new ProcessingState());
    }

    @Override
    public void sendNotification(Order order) {
        
        System.out.println("Notification: Order received.");
    }
}