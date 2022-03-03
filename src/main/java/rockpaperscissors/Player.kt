package rockpaperscissors

class Player(val name: String, val move: Move) {
    fun vs(opponent: Player): Result {
        val result = move.vs(opponent.move)
        return when {
            result == 0 -> Tie(this, opponent)
            result > 0 -> Win(this, opponent)
            else -> Win(opponent, this)
        }
    }

}
