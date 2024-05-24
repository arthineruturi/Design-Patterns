package Composite;

class RAM implements Component {
    private String name;

    public RAM(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("RAM: " + name);
    }
}
