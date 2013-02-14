package math.test;

import junit.framework.Assert;
import math.Node;
import math.data.Constant;
import math.operator.binary.Substract;
import org.junit.Test;

public class SubTest {

    @Test
    public void subTwoConstant() {
        Node sub = new Substract(new Constant(10), new Constant(2));
        Assert.assertEquals(8, sub.evaluate(), 0);
    }

    @Test
    public void addThreeConstant() {
        Node add = new Substract(new Constant(10), new Substract(new Constant(5), new Constant(2)));
        Assert.assertEquals(17, add.evaluate(), 0);
    }

    @Test
    public void addFourConstant() {
        Node add = new Substract(new Substract(new Constant(10), new Constant(2)),
                new Substract(new Constant(10), new Constant(2)));
        Assert.assertEquals(24, add.evaluate(), 0);
    }
}
