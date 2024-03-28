package Factory;

class SmartphoneFactory implements DeviceFactory {
    private String brand;

    public SmartphoneFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public Device createDevice() {
        return new Smartphone(brand);
    }
}
