package Prototype;

class ConcretePrototype1 implements Prototype {
    private String name;
    private int data;

    public ConcretePrototype1(String name, int data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.name, this.data);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1(name=" + name + ", data=" + data + ")";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(int data) {
        this.data = data;
    }
}