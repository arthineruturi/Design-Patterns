package Flyweight;

//Concrete flyweight class
class TreeType implements Tree {
 private String name;  // Intrinsic state
 private String color; // Intrinsic state
 private String texture; // Intrinsic state

 public TreeType(String name, String color, String texture) {
     this.name = name;
     this.color = color;
     this.texture = texture;
 }

 @Override
 public void draw(int x, int y) {
     // Using intrinsic state (name, color, texture) and extrinsic state (x, y)
     System.out.println("Drawing " + name + " tree of color " + color + " and texture " + texture + " at (" + x + ", " + y + ")");
 }

 // Overriding equals and hashCode to ensure flyweights with the same intrinsic state are shared
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     TreeType treeType = (TreeType) obj;
     return Objects.equals(name, treeType.name) && Objects.equals(color, treeType.color) && Objects.equals(texture, treeType.texture);
 }

 @Override
 public int hashCode() {
     return Objects.hash(name, color, texture);
 }
}

