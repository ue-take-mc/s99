package P26

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/07/01.
  */
class P26Spec extends FunSpec with DiagrammedAssertions {
  describe("P26") {
    it ("normal test") {
      assert(P26.combinations(2, List(1, 2)) == List(List(1,2)))
    }
  }
}
