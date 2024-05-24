package Flyweight;

class TreeFactory {
    // Pool of flyweight objects (TreeType instances)
    private static Map<TreeType, Tree> treeTypes = new HashMap<>();

    // Factory method to get a TreeType instance
    public static Tree getTreeType(String name, String color, String texture) {
        TreeType key = new TreeType(name, color, texture);
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, key);
            System.out.println("Creating tree type: " + name + ", color: " + color + ", texture: " + texture);
        }
        return treeTypes.get(key);
    }

    public static int getTotalTreeTypes() {
        return treeTypes.size();
    }
}

