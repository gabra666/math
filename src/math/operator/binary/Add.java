package math.operator.binary;

import math.Node;
import math.Value;
import math.data.MathDouble;
import math.operator.BinaryOperator;

public class Add extends BinaryOperator {

    public Add(Node leftChild, Node rigthChild) {
        super(leftChild, rigthChild);
    }

    @Override
    public Value evaluate() {
        return new MathDouble(getLeftChild().evaluate() +
                getRigthChild().evaluate();
       
    }
}
