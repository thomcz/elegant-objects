package rockpaperscissors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RockTest {
    @Test
    fun rockVsPaper() {
        val result = Rock().vs(Paper())

        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun rockVsRock() {
        val result = Rock().vs(Rock())

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun rockVsScissor() {
        val result = Rock().vs(Scissor())
        assertThat(result).isEqualTo(1)
    }
}