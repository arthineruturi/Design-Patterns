package Facade;

public class SavingsAccountService {
    public String openAccount(String customerName) {
        return String.format("Savings account opened for %s", customerName);
    }

    public String closeAccount(String customerName) {
        return String.format("Savings account closed for %s", customerName);
    }
}

