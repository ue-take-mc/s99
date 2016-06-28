package P18

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/28.
  */
class P18Spec extends FunSpec with DiagrammedAssertions {
  describe("P18") {
    it ("slice for many elements") {
      assert(P18.slice(2,5, List(10,11,12,13,14,15,16)) == List(12,13,14))
    }
  }
}
