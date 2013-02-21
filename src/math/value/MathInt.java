package math.value;

import math.Value;

public class MathInt extends Value {

    private final int value;

    public MathInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
