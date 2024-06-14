package Interpreter;

import java.util.Stack;

public class Composite implements Expression {
    private Stack<Expression> expressions;

    public Composite(Stack<Expression> expressions) {
        this.expressions = expressions;
      
    }

    @Override
    public int interpret() {
        int result = 0;
        while (!expressions.isEmpty()) {
            result += expressions.pop().interpret();
        }
        return result;
    }
}

