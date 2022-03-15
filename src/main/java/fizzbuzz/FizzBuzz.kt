package fizzbuzz

class FizzBuzz(val number: Int) {
    fun evaluate(): String {
        if (this.number % 3 == 0 && this.number % 5 == 0 ) {
            return "FizzBuzz"
        }
        if (this.number % 3 == 0) {
            return "Fizz"
        }

        if (this.number % 5 == 0) {
            return "Buzz"
        }
        return this.number.toString();
    }

}
