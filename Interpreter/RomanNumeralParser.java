package Interpreter;

import java.util.Stack;

public class RomanNumeralParser {
    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            stack.push(new Roman(String.valueOf(ch)));
            
        }

        return new Composite(stack);
    }
}
