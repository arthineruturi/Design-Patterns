package COR;

class Rupee2000Dispenser implements DispenseChain {

    private DispenseChain nextNote;

    @Override
    public void setNextChain(DispenseChain nextNote) {
        this.nextNote = nextNote;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 2000) {
            int num = amount / 2000;
            int remainder = amount % 2000;
            System.out.println("Dispensing " + num + " 2000₹ note");
            if (remainder != 0) {
                this.nextNote.dispense(remainder);
            }
        } else {
            this.nextNote.dispense(amount);
        }
    }
}
