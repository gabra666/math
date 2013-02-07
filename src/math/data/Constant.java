package math.data;

import math.Node;

public class Constant extends Node{

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    
    @Override
    public float evaluate(){
     return value;   
    }
}
