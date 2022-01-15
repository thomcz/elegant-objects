import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
class SumTest {
    @Test
    void sumOfInteger() {
        Value sum = new Sum(1, 2);

        assertThat(sum.intValue()).isEqualTo(3);
    }

    @Test
    void sumOfFloat() {
        Value sum = new Sum(1.5f, 2.4f);

        assertThat(sum.floatValue()).isEqualTo(3.9f);
    }
    @Test
    void sumOfDouble() {
        Value sum = new Sum(1.5d, 2.4d);

        assertThat(sum.doubleValue()).isEqualTo(3.9d);
    }

    @Test
    void sumOfList() {
        Sum sum = new Sum(1, 2, 3, 4);

        assertThat(sum.intValue()).isEqualTo(10);
    }
}
