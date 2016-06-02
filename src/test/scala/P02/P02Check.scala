package P02

import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}

/**
  * Created by tksued on 2016/05/14.
  */
class P02Check extends Properties("P02") {
  property("penultimate()") = forAll{(s: List[Int]) =>
    (s.size > 1) ==> (P02.penultimate(s) == s.init.last)
  }
}
