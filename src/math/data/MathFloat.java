package math.data;

import math.Value;

public class MathFloat implements Value {

    private final float value;

    public MathFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
