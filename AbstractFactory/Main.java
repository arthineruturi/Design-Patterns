package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory hyundaiFactory = new HyundaiFactory();
        VehicleFactory toyotaFactory = new ToyotaFactory();

        Car hyundaiCar = hyundaiFactory.createCar();
        Bike hyundaiBike = hyundaiFactory.createBike();

        Car toyotaCar = toyotaFactory.createCar();
        Bike toyotaBike = toyotaFactory.createBike();

        hyundaiCar.drive();
        hyundaiBike.ride();

        toyotaCar.drive();
        toyotaBike.ride();
    }
}
