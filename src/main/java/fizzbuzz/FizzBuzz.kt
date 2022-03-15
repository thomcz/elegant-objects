package fizzbuzz

class FizzBuzz(private val number: Int) : FizzBuzzer {
    private val fizz = Fizz(number)
    override fun evaluate(): String {
        if (this.number % 3 == 0 && this.number % 5 == 0) {
            return "FizzBuzz"
        }
        return this.fizz.evaluate();
    }
}
