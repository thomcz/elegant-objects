public class Abs implements Value {
    private final Number number;

    public Abs(Number number) {
        this.number = number;
    }

    @Override
    public Integer intValue() {
        return abs().intValue();
    }

    @Override
    public Float floatValue() {
        return abs().floatValue();
    }

    @Override
    public Double doubleValue() {
        return abs();
    }

    private Double abs() {
        double value = number.doubleValue();
        if (value < 0) {
            return value * -1;
        }
        return value;
    }
}
