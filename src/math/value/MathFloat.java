package math.value;

import math.Value;

public class MathFloat extends Value {

    private final float value;

    public MathFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
