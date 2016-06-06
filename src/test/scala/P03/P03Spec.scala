package P03

import org.scalatest.{DiagrammedAssertions, FunSpec}

/**
  * Created by tksued on 2016/06/04.
  */
class P03Spec extends FunSpec with DiagrammedAssertions {
  describe("P03") {
    it ("for empty list and positive index(should fail)") {
      intercept[Throwable] {
        P03.nth(99, List[Int]())
      }
    }
    it ("for empty list and index 0(should fail)") {
      intercept[Throwable] {
        P03.nth(0, List[Int]())
      }
    }
    it ("for empty list and negative index(should fail)") {
      intercept[Throwable] {
        P03.nth(-1, List[Int]())
      }
    }
    it ("for list contains one element and index larger than 0(should fail)") {
      intercept[Throwable] {
        P03.nth(1, List[Int](1))
      }
    }
    it ("for List contains one element and negative index(should fail") {
      intercept[Throwable] {
        P03.nth(-1, List[Int](1))
      }
    }
    it ("for list contains one element and index 0") {
      assert(P03.nth(0, List[Int](1)) == 1)
    }
    it ("for list contains N-elements and index larger than (N-1) (should fail)") {
      intercept[Throwable] {
        P03.nth(10, List[Int](0,1,2,3,4,5,6,7,8,9))
      }
    }
    it ("for list contains N-elements and negative index (should fail)") {
      intercept[Throwable] {
        P03.nth(-1, List[Int](0,1,2,3,4,5,6,7,8,9))
      }
    }
    it ("for list contains N-elements and index smaller then N") {
      assert(P03.nth(9, List[Int](0,1,2,3,4,5,6,7,8,9)) == 9)
    }
  }
}
