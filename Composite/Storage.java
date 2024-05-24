package Composite;

class Storage implements Component {
    private String name;

    public Storage(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Storage: " + name);
    }
}
