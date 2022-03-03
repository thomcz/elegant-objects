package rockpaperscissors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {

    @Test
    fun tie() {
        val player = Player("", Rock())
        val opponent = Player("", Rock())

        val result: Result = player.vs(opponent)

        assertThat(result.winner()).contains("It was a tie.")
    }

    @Test
    fun player1Won() {
        val player = Player("player1", Rock())
        val opponent = Player("player2", Scissor())

        val result: Result = player.vs(opponent)

        assertThat(result.winner()).isEqualTo("${player.name} won ${player.name} choose ${player.move}, ${opponent.name} choose ${opponent.move}")
    }

    @Test
    fun player2Won() {
        val player = Player("player1", Rock())
        val opponent = Player("player2", Paper())

        val result: Result = player.vs(opponent)

        assertThat(result.winner()).isEqualTo("${opponent.name} won ${opponent.name} choose ${opponent.move}, ${player.name} choose ${player.move}")
    }

}