import java.math.BigDecimal;
import java.util.Arrays;

public class Sum implements Value {
    private final Numbers numbers;


    public Sum(Number... numbers) {
        this.numbers = new Numbers(numbers);
    }

    @Override
    public Integer intValue() {
        return sum().intValue();
    }

    @Override
    public Float floatValue() {
        return sum().floatValue();
    }

    @Override
    public Double doubleValue() {
        return sum().doubleValue();
    }

    @Override
    public Long longValue() {
        return sum().longValue();
    }

    private BigDecimal sum() {
        return Arrays.stream(numbers.converting())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


}
