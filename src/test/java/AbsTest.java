import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class AbsTest {

    @Test
    void absBigDecimalValue_positive() {
        Abs abs = new Abs(BigDecimal.valueOf(5));

        assertThat(abs.intValue()).isEqualTo(5);
    }

    @Test
    void absBigDecimalValue_negative() {
        Abs abs = new Abs(BigDecimal.valueOf(-5));

        assertThat(abs.intValue()).isEqualTo(5);
    }

    @Test
    void absIntValue_positive() {
        Abs abs = new Abs(5);

        assertThat(abs.intValue()).isEqualTo(5);
    }

    @Test
    void absIntValue_negative() {
        Abs abs = new Abs(-5);

        assertThat(abs.intValue()).isEqualTo(5);
    }

    @Test
    void absFloatValue_positive() {
        Abs abs = new Abs(5.5f);

        assertThat(abs.floatValue()).isEqualTo(5.5f);
    }

    @Test
    void absFloatValue_negative() {
        Abs abs = new Abs(-5.5f);

        assertThat(abs.floatValue()).isEqualTo(5.5f);
    }

    @Test
    void absDoubleValue_positive() {
        Abs abs = new Abs(5.5d);

        assertThat(abs.doubleValue()).isEqualTo(5.5d);
    }

    @Test
    void absDoubleValue_negative() {
        Abs abs = new Abs(-5.5d);

        assertThat(abs.doubleValue()).isEqualTo(5.5d);
    }

    @Test
    void absLongValue_positive() {
        Abs abs = new Abs(5L);

        assertThat(abs.longValue()).isEqualTo(5L);
    }

    @Test
    void absLongValue_negative() {
        Abs abs = new Abs(-5L);

        assertThat(abs.longValue()).isEqualTo(5L);
    }

    @Test
    void correctFloatParsing() {
        Abs abs = new Abs(0.99f);

        assertThat(abs.doubleValue()).isEqualTo(0.99d);
    }
}
