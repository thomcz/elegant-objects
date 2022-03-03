package rockpaperscissors

class Win(val winner: Player, val looser: Player) : Result {
    override fun winner(): String {
        return "${winner.name} won ${winner.name} choose ${winner.move}, ${looser.name} choose ${looser.move}";
    }

}
