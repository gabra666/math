package math.data;

import math.Value;

public class MathBoolean implements Value {

    private final boolean value;

    public MathBoolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
