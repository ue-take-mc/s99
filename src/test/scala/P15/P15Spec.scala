package P15

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by tksued on 2016/06/23.
  */
class P15Spec extends FunSpec with DiagrammedAssertions {
  describe("P15") {
    it ("for Nil") {
      assert(P15.duplicateN(10, Nil) == Nil)
    }
    it ("for n <= 0") {
      assert(P15.duplicateN(0, List(100)) == List())
    }
    it ("for list that has one element") {
      assert(P15.duplicateN(10, List(10)) == List(10,10,10,10,10,10,10,10,10,10))
    }
    it ("for list that has two elements") {
      assert(P15.duplicateN(5, List(99,101)) == List(99,99,99,99,99,101,101,101,101,101))
    }
    it ("for list that has many elements") {
      assert(P15.duplicateN(3, List(1,2,3,4,5,6,7)) == List(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7))
    }
  }
}
