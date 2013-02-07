package math.operator;

import math.Node;

public abstract class BinaryOperator extends Operator {
    private final Node leftChild;
    private final Node rigthChild;

    public BinaryOperator(Node leftChild, Node rigthChild) {
        this.leftChild = leftChild;
        this.rigthChild = rigthChild;
    }
  
    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRigthChild() {
        return rigthChild;
    }    
}
