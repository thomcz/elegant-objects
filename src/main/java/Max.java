import java.math.BigDecimal;

public class Max implements Value {
    private final BigDecimal left;
    private final BigDecimal right;

    public Max(Integer left, Integer right) {
        this(BigDecimal.valueOf(left), BigDecimal.valueOf(right));
    }

    public Max(Float left, Float right) {
        this(new BigDecimal(left.toString()), new BigDecimal(right.toString()));
    }

    public Max(Long left, Long right) {
        this(BigDecimal.valueOf(left), BigDecimal.valueOf(right));
    }

    public Max(Double left, Double right) {
        this(BigDecimal.valueOf(left), BigDecimal.valueOf(right));
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
