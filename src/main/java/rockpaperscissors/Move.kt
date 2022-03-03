package rockpaperscissors

abstract class Move {
    fun vs(move: Move): Int {
        return when {
            this.code() == move.code() -> 0
            (this.code() - move.code() + 3) % 3 == 1 -> 1
            else -> -1
        }
    }

    abstract fun code(): Int

}
