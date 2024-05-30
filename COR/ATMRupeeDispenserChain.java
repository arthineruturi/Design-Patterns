package COR;
import java.util.Scanner;
public class ATMRupeeDispenserChain {

    private DispenseChain c1;

    public ATMRupeeDispenserChain() {
        
        this.c1 = new Rupee2000Dispenser();
        DispenseChain c2 = new Rupee500Dispenser();
        DispenseChain c3 = new Rupee100Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

   
    public static void main(String[] args) {
        ATMRupeeDispenserChain atmDispenser = new ATMRupeeDispenserChain();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to Withdraw Cash");
        int choice1 = input.nextInt();
        while (choice1==1) {
            System.out.println("ATM Menu:");
            System.out.println("1. Dispense Cash");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to dispense: ");
                    int amount = input.nextInt();
                    if (amount % 100 != 0) {
                        System.out.println("Amount should be in multiple of 100₹.");
                    } else {
                       
                        atmDispenser.c1.dispense(amount);
                    }
                    break;

                case 2:
                    System.out.println("Exiting...");
                    choice1 = 0;                
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
    }

}
