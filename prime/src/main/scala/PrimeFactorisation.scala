object PrimeFactorisation {
  def factorise(i: Int): List[Int] =
    if (i == 1) Nil
    else {
      val factor = nextFactor(i)
      factor :: factorise(i / factor)
    }

  def nextFactor(i: Int) = (2 to i).find(i % _ == 0).get
}