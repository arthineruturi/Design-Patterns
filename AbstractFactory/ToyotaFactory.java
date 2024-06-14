package AbstractFactory;


class ToyotaFactory implements VehicleFactory {
    public Car createCar() {
        return new ToyotaCar();
    }

    public Bike createBike() {
        return new ToyotaBike();
    }
}