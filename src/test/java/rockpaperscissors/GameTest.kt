package rockpaperscissors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun rockVsPaper() {
        val player1 = Player("player1", Rock())
        val player2 = Player("player2", Paper())

        val game = Game(player1 = player1, player2 = player2)
        val result = game.run()

        assertThat(result.winner()).isEqualTo("player2 won player2 choose Paper, player1 choose Rock")
    }

    @Test
    fun rockVsScissor() {
        val player1 = Player("player1", Rock())
        val player2 = Player("player2", Scissor())

        val game = Game(player1, player2)
        val result = game.run()

        assertThat(result.winner()).isEqualTo("player1 won player1 choose Rock, player2 choose Scissor")
    }
}