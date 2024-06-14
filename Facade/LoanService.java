package Facade;

public class LoanService {
    public String applyForLoan(String customerName, double amount) {
        return String.format("%s applied for a loan of $%.2f", customerName, amount);
    }

    public String payLoan(String customerName, double amount) {
        return String.format("%s paid loan amount of $%.2f", customerName, amount);
    }
}
