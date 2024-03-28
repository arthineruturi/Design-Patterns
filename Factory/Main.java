package Factory;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
        DeviceFactory dellLaptopFactory = new LaptopFactory("Dell");
        Device lenovoLaptop = new LaptopFactory("Lenovo").createDevice();
        Device dellLaptop = dellLaptopFactory.createDevice();
        DeviceFactory samsungPhoneFactory = new SmartphoneFactory("Samsung");
        Device samsungPhone = samsungPhoneFactory.createDevice();
        //lenovoLaptop.getDetails();
        List<Device> devices = new ArrayList<>();
        devices.add(lenovoLaptop);
        devices.add(dellLaptop);
        devices.add(samsungPhone);

        System.out.println("Getting details of devices:");
        for (Device device : devices) {
            device.getDetails();
        }
    }
}
