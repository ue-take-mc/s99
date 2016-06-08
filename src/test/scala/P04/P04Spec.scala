package P04

import org.scalatest.{DiagrammedAssertions, FunSpec}

/**
  * Created by ueda on 2016/06/08.
  */
class P04Spec extends FunSpec with DiagrammedAssertions {
  describe("P04") {
    it ("for empty list") {
      assert(P04.size(List[Int]()) == 0)
      assert(P04.sizeByTailRecursive(List[Int]()) == 0)
    }
    it ("for list which has one element") {
      assert(P04.size(List[Int](1)) == 1)
      assert(P04.sizeByTailRecursive(List[Int](1)) == 1)
    }
    it ("for list which has many element") {
      assert(P04.size((1 to 100).toList) == 100)
      assert(P04.size(('a' to 'z').toList) == 26)
    }
  }
}
