package P22

import org.scalacheck.{Gen, Prop, Properties}
import org.scalacheck.Prop.{BooleanOperators, forAll}
/**
  * Created by ueda on 2016/06/30.
  */
class P22Check extends Properties("P22") {
  property("range()") = {
    val gen = for {
      i <- Gen.choose(0, 10)
      j <- Gen.choose(i, 10)
    } yield (i, j)

    Prop.forAll(gen) { case (i, j) =>
      P22.range(i, j) == Range(i, j).toList
    }
  }
}
