package fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource

class FizzBuzzTest {
    @ParameterizedTest(name = "{index} => calculate({0})")
    @ValueSource(ints = [1, 2, 4, 7, 11, 13, 14])
    fun printNumbers(number:Int) {
        val fizzBuzz = FizzBuzz(number)

        val result:String = fizzBuzz.evaluate()

        assertThat(result).isEqualTo(number.toString())
    }

    @ParameterizedTest(name = "{index} => calculate({0})")
    @ValueSource(ints = [3,6,9,12,18,21,24,27,33])
    fun printFizz(number:Int) {
        val fizzBuzz = FizzBuzz(number)

        val result:String = fizzBuzz.evaluate()

        assertThat(result).isEqualTo("Fizz")
    }

    @ParameterizedTest(name = "{index} => calculate({0})")
    @ValueSource(ints = [5, 10, 20, 25, 35, 40, 50, 55])
    fun printBuzz(number: Int) {
        val fizzBuzz = FizzBuzz(number)

        val result:String = fizzBuzz.evaluate()

        assertThat(result).isEqualTo("Buzz")
    }

    @ParameterizedTest(name = "{index} => calculate({0})")
    @ValueSource(ints = [15,30,45,60,75,90])
    fun printFizzBuzz(number: Int) {
        val fizzBuzz = FizzBuzz(number)

        val result:String = fizzBuzz.evaluate()

        assertThat(result).isEqualTo("FizzBuzz")
    }
}