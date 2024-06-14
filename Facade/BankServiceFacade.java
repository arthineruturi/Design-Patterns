package Facade;

public class BankServiceFacade {
    private SavingsAccountService savingsAccountService;
    private LoanService loanService;
    private CreditCardService creditCardService;
    private InvestmentService investmentService;

    public BankServiceFacade() {
        this.savingsAccountService = new SavingsAccountService();
        this.loanService = new LoanService();
        this.creditCardService = new CreditCardService();
        this.investmentService = new InvestmentService();
    }

    public String openSavingsAccount(String customerName) {
        return savingsAccountService.openAccount(customerName);
    }

    public String closeSavingsAccount(String customerName) {
        return savingsAccountService.closeAccount(customerName);
    }

    public String applyForLoan(String customerName, double amount) {
        return loanService.applyForLoan(customerName, amount);
    }

    public String payLoan(String customerName, double amount) {
        return loanService.payLoan(customerName, amount);
    }

    public String issueCreditCard(String customerName) {
        return creditCardService.issueCreditCard(customerName);
    }

    public String blockCreditCard(String customerName) {
        return creditCardService.blockCreditCard(customerName);
    }

    public String investInStocks(String customerName, double amount) {
        return investmentService.investInStocks(customerName, amount);
    }

    public String withdrawFromStocks(String customerName, double amount) {
        return investmentService.withdrawFromStocks(customerName, amount);
    }
}
