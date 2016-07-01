package P24

import org.scalacheck.{Arbitrary, Gen, Prop, Properties}
/**
  * Created by ueda on 2016/07/01.
  */
class P24Check extends Properties("P24") {
  property("lotto()") = {
    val gen = for {
      m <- Gen.choose(0, 100)
      n <- Gen.choose(0, m - 1)
    } yield (n, m)

    Prop.forAll(gen) {
      case (n, m) =>
        val lotto = P24.lotto(n, m)
        lotto.distinct == lotto
    }
  }
}
