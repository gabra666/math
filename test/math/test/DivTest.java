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
}
