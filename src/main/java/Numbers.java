import java.math.BigDecimal;
import java.util.Arrays;

public class Numbers {
    private final Number[] numbers;

    public Numbers(Number[] numbers) {
        this.numbers = numbers;
    }

    public BigDecimal[] converting() {
        return Arrays.stream(numbers)
                .map(number -> new BigDecimal(number.toString()))
                .toArray(BigDecimal[]::new);
    }
}
