package P11

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/22.
  */
class P11Spec extends FunSpec with DiagrammedAssertions {
  describe("P11") {
    it("list contains no elements") {
      assert(P11.encodeModified(List[Int]()) == List[Int]())
    }
    it("list contains one element") {
      assert(P11.encodeModified(List[Int](99)) == List(99))
    }
    it("list contains two same elements") {
      assert(P11.encodeModified(List[Int](99, 99)) == List((2, 99)))
    }
    it("list contains two different elements") {
      assert(P11.encodeModified(List[Int](99, 100)) == List(99, 100))
    }
    it("list contains many elements") {
      assert(P11.encodeModified(List[Int](99, 100, 99, 100, 101, 100, 100, 101, 101)) == List(99,100,99,100,101, (2, 100), (2, 101)))
    }
  }
}
