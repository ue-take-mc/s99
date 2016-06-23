package P14

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
/**
  * Created by ueda on 2016/06/23.
  */
class P14Check extends Properties("P14") {
  property("P14.duplicate()") = forAll{ (s: List[Int]) =>
    P14.duplicate(s) == s.map{e => List(e, e)}.flatten
  }
}
