package math.operator.binary;

import math.operator.BinaryOperator;
import math.Node;

public class Multiply extends BinaryOperator {

    public Multiply(Node leftChild, Node rigthChild) {
        super(leftChild, rigthChild);
    }

    @Override
    public float evaluate() {
        return getLeftChild().evaluate() * getRigthChild().evaluate();
    }
}
