package P18

import org.scalacheck.{Arbitrary, Gen, Prop, Properties}
/**
  * Created by ueda on 2016/06/28.
  */
class P18Check extends Properties("P18") {
  property("slice()") = {
    val gen = for {
      i <- Gen.choose(1, 10)
      k <- Gen.choose(i, 10)
      n <- Gen.choose(10, 20)
      s <- Gen.listOfN(n, implicitly[Arbitrary[Int]].arbitrary)
    } yield (s, i, k)

    Prop.forAll(gen){ case (list, i, k) =>
      P18.slice(i, k, list) == list.slice(i, k)
    }
  }
}
