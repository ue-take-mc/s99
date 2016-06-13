package P07

import org.scalatest.{DiagrammedAssertions, FunSpec}
/**
  * Created by ueda on 2016/06/13.
  */
class P07Spec extends FunSpec with DiagrammedAssertions {
  describe("P07") {
    it ("for nested list") {
      assert(P07.flatten(List(List(1,1), 1, List(3,4,5,6))) ==
        List(1,1,1,3,4,5,6))
    }
    it ("for nested list(flatten2)") {
      assert(P07.flatten2(List(List(1,1), List(1,2,3), List(3,4,5,6))) ==
        List(1,1,1,2,3,3,4,5,6))
    }
  }
}
