package Facade;

import java.util.HashMap;
import java.util.Map;

public class SavingsAccountService {
    private Map<String, Boolean> accountStatus;

    public SavingsAccountService() {
       
        accountStatus = new HashMap<>();
    }

    public String openAccount(String customerName) {
        
        if (accountStatus.containsKey(customerName)) {
        	
            return String.format("Savings account already exists and is open for %s", customerName);
        }

      
        accountStatus.put(customerName, true);
        return String.format("Savings account opened for %s", customerName);
    }

    public String closeAccount(String customerName) {
    
        if (accountStatus.containsKey(customerName)) {
            
            accountStatus.put(customerName, false);
            return String.format("Savings account closed for %s", customerName);
        } else if (accountStatus.containsKey(customerName)) {
            return String.format("Savings account for %s is already closed", customerName);
        } else {
            return String.format("No savings account found for %s", customerName);
        }
    }
}
