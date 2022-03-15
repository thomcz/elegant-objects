package fizzbuzz

class Fizz(private val number: Int) : FizzBuzzer {
    private val buzz = Buzz(number)
    override fun evaluate(): String {
        if (this.number % 3 == 0) {
            return "Fizz"
        }
        return this.buzz.evaluate()
    }

}
