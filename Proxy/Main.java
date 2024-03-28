package Proxy;

public class Main {
    public static void main(String[] args) {
        Image imageProxy1 = new ImageProxy("image1.jpg");
        imageProxy1.display();  
        imageProxy1.display();  //(from cache)

        Image imageProxy2 = new ImageProxy("image2.jpg");
        imageProxy2.display();  
        imageProxy2.display();  
    }
}

