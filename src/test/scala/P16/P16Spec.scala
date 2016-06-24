package P16

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/24.
  */
class P16Spec extends FunSpec with DiagrammedAssertions {
  describe("P16") {
    it ("for empty list") {
      assert(P16.drop(10, List()) == List())
      assert(P16.dropWithTailRecursive(10, List()) == List())
      assert(P16.dropWithZipWithIndex(10, List()) == List())
    }
    it ("list for many elements") {
      assert(P16.drop(3, List(1,2,3,1,2,3)) == List(1,2,1,2))
      assert(P16.dropWithTailRecursive(3, List(1,2,3,1,2,3)) == List(1,2,1,2))
      assert(P16.dropWithZipWithIndex(3, List(1,2,3,1,2,3)) == List(1,2,1,2))
    }
  }
}
