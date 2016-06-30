package P22

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/30.
  */
class P22Spec extends FunSpec with DiagrammedAssertions {
  describe("P22") {
    it ("for end smaller than start") {
      assert(P22.range(10, 1) == List())
    }
    it ("for end and start equals") {
      assert(P22.range(10,10) == List(10))
    }
  }
}
