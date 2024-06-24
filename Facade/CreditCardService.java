package Facade;

public class CreditCardService {
    private double defaultCreditLimit = 1000.0; 
    private double maxCreditLimit = 5000.0; 

    public String issueCreditCard(String customerName) {
        double initialCreditLimit = defaultCreditLimit;
        return String.format("Credit card issued to %s with an initial credit limit of $%.2f", customerName, initialCreditLimit);
    }

    public String blockCreditCard(String customerName) {
        return String.format("Credit card blocked for %s", customerName);
    }

    public String increaseCreditLimit(String customerName, double newLimit) {
        if (newLimit <= maxCreditLimit) {
            return String.format("Credit limit increased to $%.2f for %s", newLimit, customerName);
        } else {
            return String.format("Failed to increase credit limit for %s. Maximum limit exceeded.", customerName);
        }
    }

    public String processPayment(String customerName, double amount) {
        return String.format("Payment of $%.2f processed for %s", amount, customerName);
    }
}
