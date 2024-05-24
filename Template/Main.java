package Template;

public class Main {
    public static void main(String[] args) {
        Game soccer = new Soccer();
        Game chess = new Chess();
        
        System.out.println("Playing Soccer:");
        System.out.println(soccer.play());
        
        System.out.println("Playing Chess:");
        System.out.println(chess.play());
    }
}

