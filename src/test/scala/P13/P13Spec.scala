package P13

import org.scalatest.{FunSpec, DiagrammedAssertions}

/**
  * Created by ueda on 2016/06/23.
  */
class P13Spec extends FunSpec with DiagrammedAssertions {
  describe("P13") {
    it("list contains no elements") {
      assert(P13.encodeDirect(List[Int]()) == List())
    }
    it("list contains one element") {
      assert(P13.encodeDirect(List[Int](99)) == List((1,99)))
    }
    it("list contains two same elements") {
      assert(P13.encodeDirect(List[Int](99, 99)) == List((2, 99)))
    }
    it("list contains two different elements") {
      assert(P13.encodeDirect(List[Int](99, 100)) == List((1, 99), (1, 100)))
    }
    it("list contains many elements") {
      assert(P13.encodeDirect(List[Int](99, 100, 99, 100, 101, 100, 100, 101, 101)) == List((1,99), (1,100), (1,99), (1,100), (1,101), (2, 100), (2, 101)))
    }
  }
}
