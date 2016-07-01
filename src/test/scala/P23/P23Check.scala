package P23

import org.scalacheck.{Arbitrary, Gen, Prop, Properties}
/**
  * Created by ueda on 2016/07/01.
  */
class P23Check extends Properties("P23") {
  property("randomSelect()") = {
    val gen = for {
      i <- Gen.choose(0, 100)
      l <- Gen.listOfN(i, implicitly[Arbitrary[Int]].arbitrary)
    } yield (l, i)

    Prop.forAll(gen) { case (l, i) =>
      P23.randomSelect(i, l).length == i
    }
  }
}
