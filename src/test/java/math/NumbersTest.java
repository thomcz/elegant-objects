package math;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {
    @Test
    void converting() {
        Numbers numbers = new Numbers(new Number[]{1, 2, 3});

        BigDecimal[] converting = numbers.converting();

        assertThat(converting[0]).isEqualTo(BigDecimal.valueOf(1));
        assertThat(converting[1]).isEqualTo(BigDecimal.valueOf(2));
        assertThat(converting[2]).isEqualTo(BigDecimal.valueOf(3));
    }
}