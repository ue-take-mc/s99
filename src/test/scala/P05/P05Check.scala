package P05

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
  * Created by ueda on 2016/06/09.
  */
class P05Check extends Properties("P05") {
  property("reverse()") = forAll {(s: List[Int]) => P05.reverse(s).equals(s.reverse)}
  property("reverseByFoldRight()") = forAll {(s: List[Int]) => P05.reverseByFoldRight(s).equals(s.reverse)}
}
