package P20

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/30.
  */
class P20Spec extends FunSpec with DiagrammedAssertions {
  describe("P20") {
    it ("for empty list and index 0") {
      intercept[Throwable] {
        P20.removeAt(0, List())
      }
    }
    it ("for negative index") {
      intercept[Throwable] {
        P20.removeAt(-100, List(100,100,100,100,100))
      }
    }
    it ("for list") {
      assert(P20.removeAt(1, List(99,100,101,102,103)) == (List(99,101,102,103), 100))
    }
  }
}
