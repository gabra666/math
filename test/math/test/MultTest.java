package math.test;

import junit.framework.Assert;
import math.Node;
import math.data.Constant;
import math.operator.binary.Multiply;
import org.junit.Test;

public class MultTest {
   @Test
   public void multTwoConstant(){
       Node mult = new Multiply(new Constant(10),new Constant(2));
       Assert.assertEquals(20, mult.evaluate(), 0);
   }
}
