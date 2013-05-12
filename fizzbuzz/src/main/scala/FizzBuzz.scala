object FizzBuzz {
  def fizzbuzz(i: Int) =
    if (i % 15 == 0) "fizzbuzz"
    else if (i % 5 == 0) "buzz"
    else if (i % 3 == 0) "fizz"
    else i.toString
}