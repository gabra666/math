package math.test;

import junit.framework.Assert;
import math.Node;
import math.data.Constant;
import math.operator.binary.Add;
import org.junit.Test;

public class AddTest {

    @Test
    public void addTwoConstant() {
        Node add = new Add(new Constant(10), new Constant(2));
        Assert.assertEquals(12, add.evaluate(), 0);
    }

    @Test
    public void addThreeConstant() {
        Node add = new Add(new Constant(10), new Add(new Constant(5), new Constant(2)));
        Assert.assertEquals(17, add.evaluate(), 0);
    }

    @Test
    public void addFourConstant() {
        Node add = new Add(new Add(new Constant(10), new Constant(2)),
                new Add(new Constant(10), new Constant(2)));
        Assert.assertEquals(24, add.evaluate(), 0);
    }
}
