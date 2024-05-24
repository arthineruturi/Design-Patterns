package Composite;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i7");
        RAM ram = new RAM("16GB DDR4");
        Storage storage = new Storage("512GB SSD");
        

        Computer computer = new Computer();
        computer.addComponent(cpu);
        computer.addComponent(ram);
        computer.addComponent(storage);

        computer.displayDetails();
    }
}