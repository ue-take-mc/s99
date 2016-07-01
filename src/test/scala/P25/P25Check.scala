package P25

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
  * Created by ueda on 2016/07/01.
  */
class P25Check extends Properties("P25") {
  property("randomPermute()") = forAll {
    (s : List[Int]) => P25.randomPermutate(s).sorted == s.sorted
  }
}
