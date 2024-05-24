package Prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ConcretePrototype1 prototype1 = new ConcretePrototype1("Prototype1", 100);
        ConcretePrototype2 prototype2 = new ConcretePrototype2(30, 50.5);

        ConcretePrototype1 clone1 = (ConcretePrototype1) prototype1.clone();
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();

        clone1.setName("Clone1");
        clone1.setData(200);

        clone2.setAge(25);
        clone2.setValue(60.5);


        System.out.println(prototype1);  // Original prototype1 remains unchanged
        System.out.println(clone1);      // Cloned 

        System.out.println(prototype2);  // Original prototype2 remains unchanged
        System.out.println(clone2);      // Cloned 
    }
}
