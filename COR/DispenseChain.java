package COR;

interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(int currency);
}
