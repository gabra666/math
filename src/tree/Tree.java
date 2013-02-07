package tree;

import static java.lang.System.out;
import math.Node;
import math.data.Constant;
import math.operator.binary.Add;
import math.operator.binary.Multiply;

public class Tree {

    public static void main(String[] args) {
        Node sum = new Add(new Constant(1), new Multiply(new Constant(2), new Constant(3)));
        out.println("El resultado es: " + sum.evaluate());
    }
}