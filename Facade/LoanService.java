package Facade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoanService {
    private boolean userValidated;
    private boolean loanApproved;
    private Map<String, Double> customerLoanBalances;

 
    private List<String> approvedCustomers = Arrays.asList("Arthi Sri", "John Doe", "Jane Smith");

    public LoanService() {
    
        customerLoanBalances = new HashMap<>();
        customerLoanBalances.put("Arthi Sri", 1000.0);
        customerLoanBalances.put("John Doe", 2000.0);
        customerLoanBalances.put("Jane Smith", 0.0);
    }

    public String applyForLoan(String customerName, double amount) {
        String userCheck = checkUser(customerName);
        if (userValidated) {
            String approval = approveLoan(customerName, amount);
            if (loanApproved) {
                double currentBalance = customerLoanBalances.getOrDefault(customerName, 0.0);
                customerLoanBalances.put(customerName, currentBalance + amount);
                return String.format("%s applied for a loan of $%.2f. %s. %s", customerName, amount, userCheck, approval);
            } else {
                return String.format("%s applied for a loan of $%.2f. %s. Loan not approved.", customerName, amount, userCheck);
            }
        } else {
            return String.format("%s applied for a loan of $%.2f. %s. Loan not approved.", customerName, amount, userCheck);
        }
    }

    public String payLoan(String customerName, double amount) {
        if (userValidated && customerLoanBalances.getOrDefault(customerName, 0.0) > 0) {
            String paymentProcessing = processPayment(customerName, amount);
            String updateLoanBalance = updateBalance(customerName, amount);
            return String.format("%s paid loan amount of $%.2f. %s. %s", customerName, amount, paymentProcessing, updateLoanBalance);
        } else {
            return String.format("%s tried to pay loan amount of $%.2f, but no loan exists or balance is already zero.", customerName, amount);
        }
    }

    private String checkUser(String customerName) {
   
        userValidated = approvedCustomers.contains(customerName);
        return userValidated ? "User validation passed" : "User validation failed";
    }

    private String approveLoan(String customerName, double amount) {
       
        loanApproved = userValidated && amount <= 10000; 
        return loanApproved ? "Loan approved" : "Loan not approved";
    }

    private String processPayment(String customerName, double amount) {
       
        return "Payment processed";
    }

    private String updateBalance(String customerName, double amount) {
    
        double currentBalance = customerLoanBalances.getOrDefault(customerName, 0.0);
        customerLoanBalances.put(customerName, Math.max(0, currentBalance - amount));
        return String.format("Loan balance updated. New balance: $%.2f", customerLoanBalances.get(customerName));
    }
}
