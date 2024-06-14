package Facade;

public class CreditCardService {
    public String issueCreditCard(String customerName) {
        return String.format("Credit card issued to %s", customerName);
    }

    public String blockCreditCard(String customerName) {
        return String.format("Credit card blocked for %s", customerName);
    }
}