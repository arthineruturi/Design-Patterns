package Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

     
        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.processPayment(100.0); 


        paymentProcessor.setPaymentStrategy(new PayPalPayment());
        paymentProcessor.processPayment(200.0);

        paymentProcessor.setPaymentStrategy(new BitcoinPayment());
        paymentProcessor.processPayment(300.0); 
    }
}
