
# State Design Pattern 
The State design pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes.


### Overview:

- **Order States**: The order can be in different states like Received, Processing, Shipped, and Delivered.
- **Order Processing**: The `Order` class manages the order state and processes orders accordingly.
- **State Transitions**: Each state transition triggers specific actions and behaviors.



1. **Initial Setup**:
   - The order starts in the "Received" state by default.

2. **Processing the Order**:
   - Use `processOrder` to process the order. It transitions to the next appropriate state based on the current state:
     - Received → Processing
     - Processing → Shipped
     - Shipped → Delivered

3. **Sending Notifications**:
   - Use `sendNotification` to send notifications based on the current order state:
     - Received: Order received notification
     - Shipped: Shipment notification
     - Delivered: Delivery confirmation

