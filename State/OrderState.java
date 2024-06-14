package State;

interface OrderState {
    void processOrder(Order order);
    void sendNotification(Order order);
}