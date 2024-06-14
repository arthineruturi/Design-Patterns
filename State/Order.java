package State;

class Order {
    private OrderState currentState;

    public Order() {
        this.currentState = new ReceivedState(); // Initial state is "received"
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void processOrder() {
        currentState.processOrder(this);
    }

    public void sendNotification() {
        currentState.sendNotification(this);
    }
}
