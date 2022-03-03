package math;

import java.math.BigDecimal;

public class Max implements Value {
    private final BigDecimal left;
    private final BigDecimal right;

    public Max(Number left, Number right) {
        this(new BigDecimal(left.toString()), new BigDecimal(right.toString()));
    }

    public Max(BigDecimal left, BigDecimal right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer intValue() {
        return max().intValue();
    }

    @Override
    public Float floatValue() {
        return max().floatValue();
    }

    @Override
    public Double doubleValue() {
        return max().doubleValue();
    }

    @Override
    public Long longValue() {
        return max().longValue();
    }

    private BigDecimal max() {
        return left.compareTo(right) > 0 ? left : right;
    }
}
