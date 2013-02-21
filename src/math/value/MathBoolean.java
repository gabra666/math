package math.value;

import math.Value;

public class MathBoolean extends Value {

    private final boolean value;

    public MathBoolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
