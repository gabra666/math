package math.operator.binary;

import math.Node;
import math.operator.BinaryOperator;

public class Divide extends BinaryOperator {

    public Divide(Node leftChild, Node rigthChild) {
        super(leftChild, rigthChild);
    }

    @Override
    public double evaluate() {
        return getLeftChild().evaluate() / getRigthChild().evaluate();
    }
}
