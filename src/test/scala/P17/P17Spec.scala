package P17

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/24.
  */
class P17Spec extends FunSpec with DiagrammedAssertions {
  describe("P17") {
    it ("for empty list") {
      assert(P17.split(10, List()) == (List(), List()))
      assert(P17.splitWithDropAndTake(10, List()) == (List(), List()))
    }
    it ("for list") {
      assert(P17.split(5, List(1,2,3,4,5,6,7,8,9,10,11)) == (List(1,2,3,4,5), List(6,7,8,9,10,11)))
      assert(P17.splitWithDropAndTake(5, List(1,2,3,4,5,6,7,8,9,10,11)) == (List(1,2,3,4,5), List(6,7,8,9,10,11)))
    }
  }
}
