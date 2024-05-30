package COR;

class Rupee500Dispenser implements DispenseChain {

    private DispenseChain nextNote;

    @Override
    public void setNextChain(DispenseChain nextNote) {
        this.nextNote = nextNote;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 500) {
        	int num = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + num + " 500₹ note");
            if (remainder != 0) {
                this.nextNote.dispense(remainder);
            }
        } else {
            this.nextNote.dispense(amount);
        }
    }
}
