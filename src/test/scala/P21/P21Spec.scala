package P21

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/30.
  */
class P21Spec extends FunSpec with DiagrammedAssertions {
  describe("P21") {
    it ("for empty list") {
      assert(P21.insertAt(0, 100, List()) == List())
      assert(P21.insertAtBySplit(0, 100, List()) == List())
    }
    it ("for list and negative index") {
      assert(P21.insertAt(1, -1, List(100, 100)) == List(100, 100))
      assert(P21.insertAtBySplit(1, -1, List(100, 100)) == List(100, 100))
    }
    it ("for list and positive index") {
      assert(P21.insertAt(1, 2, List(100, 100, 100, 100, 100)) == List(100, 100, 1, 100, 100, 100))
      assert(P21.insertAtBySplit(1, 2, List(100, 100, 100, 100, 100)) == List(100, 100, 1, 100, 100, 100))
    }
  }
}
