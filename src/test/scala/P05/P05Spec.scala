package P05

import org.scalatest.{DiagrammedAssertions, FunSpec}

/**
  * Created by ueda on 2016/06/09.
  */
class P05Spec extends FunSpec with DiagrammedAssertions {
  describe("P05") {
    it ("for empty list") {
      assert(P05.reverse(List[Int]()).isEmpty)
      assert(P05.reverseByFoldRight(List[Int]()).isEmpty)
    }
    it ("for list") {
      assert(P05.reverse(List[Int](1,2,3,4,5)).equals(List[Int](5,4,3,2,1)))
      assert(P05.reverseByFoldRight(List[Int](1,2,3,4,5)).equals(List[Int](5,4,3,2,1)))
    }
    it ("for long list") {
      assert(P05.reverse((1 to 1000).toList).equals((1 to 1000).toList.reverse))
      assert(P05.reverseByFoldRight((1 to 1000).toList).equals((1 to 1000).toList.reverse))
    }
  }
}
