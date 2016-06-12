package P07

import org.scalacheck.{Arbitrary, Prop, Properties}
import org.scalacheck.Gen.{choose, listOfN}

/**
  * Created by tksued on 2016/06/12.
  */
class P07Check extends Properties("P07") {
  def smallListArb[A](implicit A: Arbitrary[A]): Arbitrary[List[A]] = {
    Arbitrary(choose(0, 5).flatMap { n =>
      listOfN(n, Arbitrary[A])
    })
  }
  /*property("P07()") = {

  }*/
}
