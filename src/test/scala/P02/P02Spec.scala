package P02

import org.scalatest.{FunSpec, DiagrammedAssertions}

/**
  * Created by tksued on 2016/05/14.
  */
class P02Spec extends FunSpec with DiagrammedAssertions {
  describe ("P02") {
    it ("for empty list(should fail)") {
      intercept[Throwable] {
        P02.penultimate(List[Int]())
      }
    }
    it ("for list contains only one element(should fail)") {
      intercept[Throwable] {
        P02.penultimate(List[Int](1))
      }
    }
    it ("for list contains two elements") {
      assert(P02.penultimate(List[Int](99, 100)) == 99)
    }
    it ("for list contains three elements") {
      assert(P02.penultimate(List[Int](98, 99, 100)) == 99)
    }
  }
}
