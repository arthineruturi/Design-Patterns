package COR;

class Rupee2000Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 2000) {
            int num = currency.getAmount() / 2000;// num=1;
            int remainder = currency.getAmount() % 2000;//rem=600;
            System.out.println("Dispensing " + num + " 2000₹ note");
            if (remainder != 0) this.nextChain.dispense(new Currency(remainder));
        } else {
            this.nextChain.dispense(currency);
        }
    }
}
