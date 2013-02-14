package math.data;

import math.Value;

public class MathInt implements Value {

    private final int value;

    public MathInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
