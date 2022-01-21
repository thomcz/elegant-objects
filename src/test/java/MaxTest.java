import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void maxIntValue() {
        Max max = new Max(1, 2);
        assertThat(max.intValue()).isEqualTo(2);
    }

    @Test
    void maxLongValue() {
        Max max = new Max(1L, 2L);
        assertThat(max.longValue()).isEqualTo(2L);
    }

    @Test
    void maxFloatValue() {
        Max max = new Max(1.1f, 1.2f);
        assertThat(max.floatValue()).isEqualTo(1.2f);
    }

    @Test
    void maxDoubleValue() {
        Max max = new Max(1.1d, 1.2d);
        assertThat(max.doubleValue()).isEqualTo(1.2d);
    }
}
