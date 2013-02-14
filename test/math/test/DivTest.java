package math.test;

import junit.framework.Assert;
import math.Node;
import math.data.Constant;
import math.operator.binary.Divide;
import org.junit.Test;

public class DivTest {

    @Test
    public void divTwoConstant() {
        Node div = new Divide(new Constant(10), new Constant(2));
        Assert.assertEquals(5, div.evaluate(), 0);
    }

    @Test
    public void addThreeConstant() {
        Node add = new Divide(new Constant(10), new Divide(new Constant(5), new Constant(2)));
        Assert.assertEquals(17, add.evaluate(), 0);
    }

    @Test
    public void addFourConstant() {
        Node add = new Divide(new Divide(new Constant(10), new Constant(2)),
                new Divide(new Constant(10), new Constant(2)));
        Assert.assertEquals(24, add.evaluate(), 0);
    }
}
