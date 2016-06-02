package P01

import org.scalatest.{FunSpec, DiagrammedAssertions}

/**
  * Created by tksued on 2016/05/14.
  */
class P01Spec extends FunSpec with DiagrammedAssertions {
  describe ("P01") {
    it ("for empty list(should fail)") {
      intercept[Throwable] {
        P01.last(List[Int]())
      }
    }
    it ("for list contains one element") {
      assert(P01.last(List(99)) == 99)
    }
    it ("for list conntains two elements") {
      assert(P01.last(List(99,100)) == 100)
    }
  }
}
