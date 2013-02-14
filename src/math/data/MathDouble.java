package math.data;

import math.Value;

public class MathDouble implements Value {

    private final double value;

    public MathDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
