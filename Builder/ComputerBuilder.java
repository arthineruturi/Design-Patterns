package Builder;

public class ComputerBuilder {
    private String model;
    private String processor;
    private int ram;
    private String storageType;
    private int storageSize;
    private String graphicsCard;
    private String coolingSystem;

    public ComputerBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public ComputerBuilder setStorageSize(int storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
        return this;
    }

    public Computer getComputer() {
        return new Computer(model, processor, ram, storageType, storageSize, graphicsCard, coolingSystem);
    }
}

