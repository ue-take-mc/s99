package P15

import org.scalacheck.{Arbitrary, Gen, Prop, Properties}

/**
  * Created by ueda on 2016/06/23.
  */
class P15Check extends Properties("P15") {
  property("duplicateN()") = {
    val gen = for {
      x <- Gen.choose(1, 10)
      y <- Gen.choose(0, x - 1)
      s <- Gen.listOfN(x, implicitly[Arbitrary[Int]].arbitrary)
    } yield (s, y)

    Prop.forAll(gen){ case (s, i) =>
      P15.duplicateN(i, s) == s.flatMap{e => List.fill(i)(e)}
    }
  }
}
