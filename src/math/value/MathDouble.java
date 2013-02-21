package math.value;

import math.Value;

public class MathDouble extends Value {

    private final double value;

    public MathDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
