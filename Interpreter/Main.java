package Interpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "XVI";
        Expression parsedExpression = RomanNumeralParser.parse(expression);
        int result = parsedExpression.interpret();
        System.out.println("Result: " + result);  
    }
}
