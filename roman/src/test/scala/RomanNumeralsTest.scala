import org.scalatest._
import org.scalatest.matchers._

class RomanNumeralsSpec extends FunSpec with ShouldMatchers {
  import RomanNumerals._

  describe ("zero case") {
    it ("should return an empty string for 0") {
      convert(0) should be ("")
    }
  }

  describe ("converting positve numbers") {
    Seq(
      (1, "I"),
      (2, "II"),
      (4, "IV"),
      (5, "V"),
      (9, "IX"),
      (10, "X"),
      (40, "XL"),
      (50, "L"),
      (90, "XC"),
      (100, "C"),
      (400, "CD"),
      (500, "D"),
      (900, "CM"),
      (1000, "M"),
      (2679, "MMDCLXXIX")
    ) foreach { case (arabic, roman) =>
      it (s"should convert $arabic to '$roman'") {
        convert(arabic) should be (roman)
      }
    }
  }
}