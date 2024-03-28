package Factory;

class Smartphone implements Device {
    private String brand;

    public Smartphone(String brand) {
        this.brand = brand;
    }

    @Override
    public void configure() {
        System.out.println(brand + " Smartphone is being configured.");
    }

    @Override
    public void assemble() {
        System.out.println(brand + " Smartphone is being assembled.");
    }

    @Override
    public void verify() {
        System.out.println(brand + " Smartphone is being verified.");
    }
    public void getDetails() {
        System.out.println("Details of " + brand + " Laptop:");
        configure();
        assemble();
        verify();
        System.out.println();
    }
}
