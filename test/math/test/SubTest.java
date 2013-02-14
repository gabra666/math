package math.test;

import junit.framework.Assert;
import math.Node;
import math.data.Constant;
import math.operator.binary.Substract;
import org.junit.Test;

public class SubTest {
       @Test
   public void subTwoConstant(){
       Node sub = new Substract(new Constant(10),new Constant(2));
       Assert.assertEquals(8, sub.evaluate(), 0);
   }
}
