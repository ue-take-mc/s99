package P19

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/29.
  */
class P19Spec extends FunSpec with DiagrammedAssertions {
  describe("P19") {
    it("for empty list") {
      assert(P19.rotate(0, List()) == List())
    }
    it("for list one element") {
      assert(P19.rotate(0, List(100)) == List(100))
      assert(P19.rotate(1, List(100)) == List(100))
      assert(P19.rotate(-100, List(100)) == List(100))
    }
    it("for list two elements") {
      assert(P19.rotate(0, List(100,101)) == List(100,101))
      assert(P19.rotate(1, List(100,101)) == List(101,100))
      assert(P19.rotate(-1, List(100,101)) == List(101,100))
    }
    it("for list many elements") {
      assert(P19.rotate(0, List(100,101,102,103,104,105,106)) == List(100,101,102,103,104,105,106))
      assert(P19.rotate(3, List(100,101,102,103,104,105,106)) == List(103,104,105,106,100,101,102))
      assert(P19.rotate(-3, List(100,101,102,103,104,105,106)) == List(104,105,106,100,101,102,103))
    }
  }
}
