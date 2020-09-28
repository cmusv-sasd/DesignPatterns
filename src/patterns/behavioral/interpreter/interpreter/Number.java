package patterns.behavioral.interpreter.interpreter;

import java.util.Map;

public class Number implements Operand {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public void traverse(int level) {
        System.out.print(value + " ");
    }

    public double evaluate(Map context) {
        return value;
    }
}
