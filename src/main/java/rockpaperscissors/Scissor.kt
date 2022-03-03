package rockpaperscissors

class Scissor : Move() {

    override fun code(): Int {
        return 2
    }

    override fun toString(): String {
        return "Scissor"
    }

}
