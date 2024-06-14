package Facade;

public class Main {
    public static void main(String[] args) {
        BankServiceFacade bankServiceFacade = new BankServiceFacade();
        
        String customerName = "Arthi Sri";
        
        // Open a savings account
        String openSavingsAccountMsg = bankServiceFacade.openSavingsAccount(customerName);
        System.out.println(openSavingsAccountMsg);

        // Apply for a loan
        String applyForLoanMsg = bankServiceFacade.applyForLoan(customerName, 5000);
        System.out.println(applyForLoanMsg);

        // Issue a credit card
        String issueCreditCardMsg = bankServiceFacade.issueCreditCard(customerName);
        System.out.println(issueCreditCardMsg);

        // Invest in stocks
        String investInStocksMsg = bankServiceFacade.investInStocks(customerName, 2000);
        System.out.println(investInStocksMsg);

        // Perform other operations
        String payLoanMsg = bankServiceFacade.payLoan(customerName, 1000);
        System.out.println(payLoanMsg);

        String withdrawFromStocksMsg = bankServiceFacade.withdrawFromStocks(customerName, 500);
        System.out.println(withdrawFromStocksMsg);

        String blockCreditCardMsg = bankServiceFacade.blockCreditCard(customerName);
        System.out.println(blockCreditCardMsg);

        String closeSavingsAccountMsg = bankServiceFacade.closeSavingsAccount(customerName);
        System.out.println(closeSavingsAccountMsg);
    }
}
