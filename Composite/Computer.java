package Composite;
import java.util.ArrayList;
import java.util.List;
class Computer implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void displayDetails() {
        for (Component component : components) {
            component.displayDetails();
        }
    }
}
