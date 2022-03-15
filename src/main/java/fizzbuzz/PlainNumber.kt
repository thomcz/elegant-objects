package fizzbuzz

class PlainNumber(private val number: Int) : FizzBuzzer {
    override fun evaluate(): String {
        return this.number.toString()
    }
}
