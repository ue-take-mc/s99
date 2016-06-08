package P04

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
  * Created by ueda on 2016/06/08.
  */
class P04Check extends Properties("P04") {
  property("size()") = forAll {(s: List[Int]) => P04.size(s) == s.length }
  property("sizeByTailRecursive()") = forAll {(s: List[Int]) => P04.sizeByTailRecursive(s) == s.length }
}
