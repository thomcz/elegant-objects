package math;

import java.math.BigDecimal;

public class Abs implements Value {
    private final BigDecimal number;

    public Abs(Number number) {
        this(new BigDecimal(number.toString()));
    }

    public Abs(BigDecimal number) {
        this.number = number;
    }

    @Override
    public Integer intValue() {
        return number.abs().intValue();
    }

    @Override
    public Float floatValue() {
        return number.abs().floatValue();
    }

    @Override
    public Long longValue() {
        return number.abs().longValue();
    }

    @Override
    public Double doubleValue() {
        return number.abs().doubleValue();
    }

}
