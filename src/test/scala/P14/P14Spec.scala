package P14

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/23.
  */
class P14Spec extends FunSpec with DiagrammedAssertions {
  describe("P14") {
    it ("for empty list") {
      assert(P14.duplicate(List()) == List())
    }
    it ("for list that have one element") {
      assert(P14.duplicate(List(99)) == List(99, 99))
    }
    it ("for list that have two elements") {
      assert(P14.duplicate(List(99,101)) == List(99,99,101,101))
    }
    it ("for list that have many elements") {
      assert(P14.duplicate(List(99,100,101,102)) == List(99,99,100,100,101,101,102,102))
    }
  }
}
