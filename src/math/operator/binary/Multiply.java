package math.operator.binary;

import math.Node;
import math.Value;
import math.operator.BinaryOperator;

public class Multiply extends BinaryOperator {

    public Multiply(Node leftChild, Node rigthChild) {
        super(leftChild, rigthChild);
    }

    @Override
    public Value evaluate() {
        return getLeftChild().evaluate() * getRigthChild().evaluate();
    }
}
