package P21

import org.scalacheck.{Arbitrary, Gen, Prop, Properties}
/**
  * Created by ueda on 2016/06/30.
  */
class P21Check extends Properties("P21") {
  property("insertAt()") = {
    val gen = for {
      i <- Gen.choose(1, 10)
      k <- Gen.choose(0, i - 1)
      e <- implicitly[Arbitrary[Int]].arbitrary
      s <- Gen.listOfN(i, implicitly[Arbitrary[Int]].arbitrary)
    } yield (s, k, e)

    Prop.forAll(gen) { case (s, i, e) =>
      P21.insertAt(e, i, s) == {
        val buf = s.toBuffer
        buf.insert(i, e)
        buf.toList
      }
    }
  }
}
