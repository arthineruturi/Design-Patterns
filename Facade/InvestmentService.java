package Facade;

public class InvestmentService {
    public String investInStocks(String customerName, double amount) {
        return String.format("%s invested $%.2f in stocks", customerName, amount);
    }

    public String withdrawFromStocks(String customerName, double amount) {
        return String.format("%s withdrew $%.2f from stocks", customerName, amount);
    }
}