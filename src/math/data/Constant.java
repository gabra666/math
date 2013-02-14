package math.data;

import math.Node;
import math.Value;

public class Constant extends Node{

    private Value value;

    public Constant(Value value) {
        this.value = value;
    }

    
    @Override
    public Value evaluate(){
      return value;   
    }
}
