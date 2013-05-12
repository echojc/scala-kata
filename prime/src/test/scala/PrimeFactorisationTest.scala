import org.scalatest._
import org.scalatest.matchers._

class PrimeFactorisationTest extends FunSpec with ShouldMatchers {
  import PrimeFactorisation._

  describe ("base case") {
    it ("should return an empty list for 1") {
      factorise(1) should be (Nil)
    }
  }

  Seq(
    (2, List(2)),
    (3, List(3)),
    (4, List(2, 2)),
    (6, List(2, 3)),
    (7644, List(2, 2, 3, 7, 7, 13))
  ) foreach { case (i, factors) =>
    it (s"should factorise $i to $factors") {
      factorise(i) should be (factors)
    }
  }
}