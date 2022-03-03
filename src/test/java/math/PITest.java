package math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PITest {
    @Test
    void piValue() {
        Pi pi = new Pi();
        assertThat(pi.value()).isEqualTo(3.14159265358979323846);
    }
}
