package rockpaperscissors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScissorTest {
    @Test
    fun scissorVsPaper() {
        val result = Scissor().vs(Paper())

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun scissorVsRock() {
        val result = Scissor().vs(Rock())

        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun scissorVsScissor() {
        val result = Scissor().vs(Scissor())

        assertThat(result).isEqualTo(0)
    }
}