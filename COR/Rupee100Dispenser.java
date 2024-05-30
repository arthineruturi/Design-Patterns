package COR;

class Rupee100Dispenser implements DispenseChain {

    private DispenseChain nextNote;

    @Override
    public void setNextChain(DispenseChain nextNote) {
        this.nextNote = nextNote;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 100) {
            int num = amount / 100;
            int remainder = amount % 100;
            System.out.println("Dispensing " + num + " 100₹ note");
            if (remainder != 0) {
                this.nextNote.dispense(remainder);
            }
        } else {
            System.out.println("Cannot withdraw money"); 
        }
    }
}
