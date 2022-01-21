public class Max implements Value {
    private final Number left;
    private final Number right;

    public Max(Number left, Number right) {
        this.left = left;
        this.right = right;
    }

    public Integer intValue() {
        int leftIntValue = left.intValue();
        int rightIntValue = right.intValue();
        return leftIntValue > rightIntValue ? leftIntValue : rightIntValue;
    }

    @Override
    public Float floatValue() {
        float leftFloatValue = left.floatValue();
        float rightFloatValue = right.floatValue();
        return leftFloatValue > rightFloatValue ? leftFloatValue : rightFloatValue;
    }

    @Override
    public Double doubleValue() {
        double leftDoubleValue = left.doubleValue();
        double rightDoubleValue = right.doubleValue();
        return leftDoubleValue > rightDoubleValue ? leftDoubleValue : rightDoubleValue;
    }

    @Override
    public Long longValue() {
        long leftLongValue = left.longValue();
        long rightLongValue = right.longValue();
        return leftLongValue > rightLongValue ? leftLongValue : rightLongValue;
    }
}
