package Builder;

public class Computer {
    private final String model;
    private final String processor;
    private final int ram;
    private final String storageType;
    private final int storageSize;
    private final String graphicsCard;
    private final String coolingSystem;

    public Computer(String model, String processor, int ram, String storageType, int storageSize, String graphicsCard, String coolingSystem) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storageType = storageType;
        this.storageSize = storageSize;
        this.graphicsCard = graphicsCard;
        this.coolingSystem = coolingSystem;
    }

    @Override
    public String toString() {
        return "Model: " + model +
                ", Processor: " + processor +
                ", RAM: " + ram + "GB" +
                ", Storage Type: " + storageType +
                ", Storage Size: " + storageSize + "GB" +
                ", Graphics Card: " + graphicsCard +
                ", Cooling System: " + coolingSystem;
    
    }
}