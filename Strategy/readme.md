
# Strategy Design Pattern

The Strategy design pattern is a behavioral pattern that enables you to define a family of algorithms, encapsulate each algorithm into a separate class, and make their objects interchangeable.


Imagine you have different ways to pay for  using a credit card, PayPal, or Bitcoin. The Strategy pattern helps manage these options by allowing you to define a family of payment methods, put each method in its own class, and easily switch between them as needed.

---

## Example

### Payment Methods:
1. **Credit Card**
2. **PayPal**
3. **Bitcoin**

### PaymentProcessor Class:
The `PaymentProcessor` class manages payments and allows changing payment methods easily.

### How to Use:

1. **Select Payment Method**:
   Use `setPaymentStrategy` to choose a payment method:
   - Credit Card: `paymentProcessor.setPaymentStrategy(new CreditCardPayment())`
   - PayPal: `paymentProcessor.setPaymentStrategy(new PayPalPayment())`
   - Bitcoin: `paymentProcessor.setPaymentStrategy(new BitcoinPayment())`

2. **Process Payment**:
   Use `processPayment` to pay a specific amount:
   - Example: `paymentProcessor.processPayment(100.0)` pays $100 using the selected method.

---

