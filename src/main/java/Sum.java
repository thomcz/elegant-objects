import java.util.Arrays;

public class Sum implements Value {
    private final Number[] numbers;


    public Sum(Number... numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer intValue() {
        return Arrays.stream(numbers)
                .mapToInt(Number::intValue)
                .sum();
    }

    @Override
    public Float floatValue() {
        return (float) Arrays.stream(numbers)
                .map(String::valueOf)
                .mapToDouble(Double::parseDouble)
                .sum();
    }

    @Override
    public Double doubleValue() {
        return Arrays.stream(numbers)
                .mapToDouble(Number::doubleValue)
                .sum();

    }


}
