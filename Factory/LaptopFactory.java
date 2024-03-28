package Factory;

class LaptopFactory implements DeviceFactory {
    private String brand;

    public LaptopFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public Device createDevice() {
        return new Laptop(brand);
    }
}