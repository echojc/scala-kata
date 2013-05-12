import org.scalatest._
import org.scalatest.matchers._

class FizzBuzzTest extends FunSpec with ShouldMatchers {
  import FizzBuzz._

  describe ("common number") {
    testConversion((1, "1"))
  }

  describe ("multiples of 3") {
    Seq(
      (3, "fizz"),
      (6, "fizz")
    ) foreach { testConversion }
  }

  describe ("multiples of 5") {
    Seq(
      (5, "buzz"),
      (10, "buzz")
    ) foreach { testConversion }
  }

  describe ("multiples of both 3 and 5") {
    Seq(
      (15, "fizzbuzz"),
      (30, "fizzbuzz")
    ) foreach { testConversion }
  }

  def testConversion(mapping: (Int, String)) = mapping match { case (number, output) =>
    it (s"should convert $number to '$output'") {
      fizzbuzz(number) should be (output)
    }
  }
}