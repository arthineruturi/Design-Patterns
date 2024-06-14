package AbstractFactory;
class HyundaiFactory implements VehicleFactory {
    public Car createCar() {
        return new HyundaiCar();
    }

    public Bike createBike() {
        return new HyundaiBike();
    }
}