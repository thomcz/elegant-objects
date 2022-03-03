package rockpaperscissors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaperTest {
    @Test
    fun paperVsRock() {
        val result = Paper().vs(Rock())

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun paperVsPaper() {
        val result = Paper().vs(Paper())

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun paperVsScissor() {
        val result = Paper().vs(Scissor())

        assertThat(result).isEqualTo(-1)
    }
}