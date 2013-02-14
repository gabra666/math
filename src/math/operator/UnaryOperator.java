package math.operator;

import math.Node;

public abstract class UnaryOperator extends Operator {

    private final Node child;

    public UnaryOperator(Node child) {
        this.child = child;
    }

    public Node getChild() {
        return child;
    }
}
