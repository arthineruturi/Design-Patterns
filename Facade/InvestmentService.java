package Facade;

import java.util.HashMap;
import java.util.Map;

public class InvestmentService {
    private Map<String, Double> accountBalances; // Map to store account balances for customers

    public InvestmentService() {
     
        accountBalances = new HashMap<>();
        accountBalances.put("Arthi Sri", 10000.0); 
    }

    public String investInStocks(String customerName, double amount) {
        
        if (!accountBalances.containsKey(customerName) || accountBalances.get(customerName) < amount) {
            return String.format("Insufficient funds for investment by %s", customerName);
        }

       
        double newBalance = accountBalances.get(customerName) - amount;
        accountBalances.put(customerName, newBalance);
        return String.format("%s invested $%.2f in stocks. New balance: $%.2f", customerName, amount, newBalance);
    }

    public String withdrawFromStocks(String customerName, double amount) {
       
        if (!accountBalances.containsKey(customerName) || accountBalances.get(customerName) < amount) {
            return String.format("Insufficient funds for withdrawal by %s", customerName);
        }

       
        double newBalance = accountBalances.get(customerName) + amount;
        accountBalances.put(customerName, newBalance);
        return String.format("%s withdrew $%.2f from stocks. New balance: $%.2f", customerName, amount, newBalance);
    }

  
}
