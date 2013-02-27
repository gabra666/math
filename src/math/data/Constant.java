package math.data;

import math.Node;

public class Constant extends Node{

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    
    @Override
    public double evaluate(){
      return value;   
    }
}
