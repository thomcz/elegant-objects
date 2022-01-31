import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EulerNumberTest {
    @Test
    void eulerNumberValue() {
        EulerNumber eulerNumber = new EulerNumber();
        assertThat(eulerNumber.value()).isEqualTo(2.7182818284590452354);
    }
}
