package math.operator.binary;

import math.Node;
import math.Value;
import math.operator.BinaryOperator;
import math.value.MathDouble;
import math.value.MathFloat;

public class Add extends BinaryOperator {

    public Add(Node leftChild, Node rigthChild) {
        super(leftChild, rigthChild);
    }

    @Override
    public Object evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String evaluate(Node leftChild, Node rigthChild) {
        return Method m leftChild
        .evaluate().getClass().getName() + "+" + leftChild.evaluate().getClass().getName();
    }

    public double doubleAdddouble(double a, double b) {
        return a + b;

    }

    public float floatAddfloat(float a, float b) {
        return a + b;

    }

    public int intAddiathInt(int a , int b) {
        return a+b;

    }
}
