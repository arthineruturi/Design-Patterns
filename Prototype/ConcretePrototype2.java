package Prototype;

class ConcretePrototype2 implements Prototype {
    private int age;
    private double value;

    public ConcretePrototype2(int age, double value) {
        this.age = age;
        this.value = value;
    }

    @Override
    public Prototype clone() {
        // Deep copy
        return new ConcretePrototype2(this.age, this.value);
    }

    @Override
    public String toString() {
        return "ConcretePrototype2(age=" + age + ", value=" + value + ")";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
