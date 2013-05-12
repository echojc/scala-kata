object RomanNumerals {
  val Conversions = Seq(
    1000 -> "M",
    900 -> "CM",
    500 -> "D",
    400 -> "CD",
    100 -> "C",
    90 -> "XC",
    50 -> "L",
    40 -> "XL",
    10 -> "X",
    9 -> "IX",
    5 -> "V",
    4 -> "IV",
    1 -> "I"
  )

  def convert(i: Int): String = {
    if (i == 0) ""
    else {
      val (arabic, roman) = nextConversionFactor(i)
      roman + convert(i - arabic)
    }
  }

  def nextConversionFactor(i: Int): (Int, String) =
    Conversions.find(_._1 <= i).get
}