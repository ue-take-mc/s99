package P13

import P10.P10
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
  * Created by ueda on 2016/06/23.
  */
class P13Check extends Properties("P13") {
  property("decodeDirect is equivalent for decode") = forAll{ (s: List[Int]) =>
    P13.encodeDirect(s) == P10.encode(s)
  }
}
