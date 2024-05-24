package Flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        drawTree("Oak", "Green", "Rough", 10, 20);
        drawTree("Pine", "Dark Green", "Smooth", 30, 40);
        drawTree("Oak", "Green", "Rough", 50, 60);
        drawTree("Pine", "Dark Green", "Smooth", 70, 80);
        drawTree("Birch", "White", "Smooth", 90, 100);

        printFlyweightInstances();
    }

    private static void drawTree(String name, String color, String texture, int x, int y) {
        Tree treeType = TreeFactory.getTreeType(name, color, texture);
        treeType.draw(x, y); // Extrinsic state (x, y) passed to the draw method
    }

    private static void printFlyweightInstances() {
        System.out.println("Total tree types created: " + TreeFactory.getTotalTreeTypes());
    }
}

