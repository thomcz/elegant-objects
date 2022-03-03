package rockpaperscissors

class Paper : Move() {

    override fun code(): Int {
        return 1
    }

    override fun toString(): String {
        return "Paper"
    }

}
