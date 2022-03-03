package rockpaperscissors

class Tie(val player: Player, val opponent: Player) : Result {
    override fun winner(): String {
        return "It was a tie. ${player.name} and ${opponent.name} choose ${player.move}";
    }
}