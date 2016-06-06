package P03

/**
  * Created by tksued on 2016/05/28.
  */

import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}

class P03Check extends Properties("P03") {
  property("nth()") = forAll{(n: Int, s: List[Int]) =>
    (s.nonEmpty && (n < s.size && n >= 0)) ==> (P03.nth(n, s).equals(s(n)))
  }
}
