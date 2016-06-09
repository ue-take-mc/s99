package P06

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
  * Created by ueda on 2016/06/10.
  */
class P06Check extends Properties("P06") {
  property("P06()") = forAll {(s: List[Int]) =>
  P06.isPalindrome(s)}
}
