package Composite;

class CPU implements Component {
    private String name;

    public CPU(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("CPU: " + name);
    }
}