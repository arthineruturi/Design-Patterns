package Builder;

public class ComputerShowroom {
    public static void main(String[] args) {
        Computer basicComputer = new ComputerBuilder()
                .setModel("Basic Model")
                .setProcessor("Intel Core i3")
                .setRam(4)
                .setStorageType("HDD")
                .setStorageSize(500)
                .getComputer();
 
        Computer gamingComputer = new ComputerBuilder()
                .setModel("Gaming Beast")
                .setProcessor("AMD Ryzen 9")
                .setRam(16)
                .setStorageType("SSD")
                .setStorageSize(1000)
                .setGraphicsCard("NVIDIA RTX 3080")
                .setCoolingSystem("Liquid Cooling")
                .getComputer();
// Computer sample =new Computer("Gaming","Processor",8,"SSD",256,"Grphics card");
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
// System.out.println(sample);
    }
}