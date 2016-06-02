package P01

import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}
/**
  * Created by tksued on 2016/05/14.
  */
class P01Check extends Properties("P01") {
  property("last()") = forAll{(s : List[Int]) =>
    (!s.isEmpty) ==> (P01.last(s) == s.last)
  }
}
