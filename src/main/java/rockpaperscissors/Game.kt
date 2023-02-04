package rockpaperscissors

class Game(private val player1: Player, private val player2: Player) {
    fun run(): Result {
        return player1.vs(opponent = player2)
    }

}
