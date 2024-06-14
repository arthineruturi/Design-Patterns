package State;

class ProcessingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already being processed.");
    }

    @Override
    public void sendNotification(Order order) {
        // No notification needed during processing
    }
}
