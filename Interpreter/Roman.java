package Interpreter;

public class Roman implements Expression {
    private String symbol;

    public Roman(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int interpret() {
        switch (symbol) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            default:
                return 0;
        }
    }
}

