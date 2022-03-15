package fizzbuzz

class Buzz(val number: Int) : FizzBuzzer {
    private val plainNumber = PlainNumber(number)
    override fun evaluate(): String {
        if (this.number % 5 == 0) {
            return "Buzz"
        }
        return this.plainNumber.evaluate()
    }

}
