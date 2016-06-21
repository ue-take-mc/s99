package P09

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/21.
  */
class P09Spec extends FunSpec with DiagrammedAssertions {
  describe("P09") {
    it("list contains no elements") {
      assert(P09.pack(List[Int]()) == List(List[Int]()))
      assert(P09.packWithTailRecursive(List[Int]()) == List[Int]())
    }
    it("list contains one element") {
      assert(P09.pack(List[Int](99)) == List(List[Int](99)))
      assert(P09.packWithTailRecursive(List[Int](99)) == List(List[Int](99)))
    }
    it("list contains two same elements") {
      assert(P09.pack(List[Int](99, 99)) == List(List[Int](99, 99)))
      assert(P09.packWithTailRecursive(List[Int](99, 99)) == List(List[Int](99, 99)))
    }
    it("list contains two different elements") {
      assert(P09.pack(List[Int](99, 100)) == List(List[Int](99), List[Int](100)))
      assert(P09.packWithTailRecursive(List[Int](99, 100)) == List(List[Int](99), List[Int](100)))
    }
    it("list contains many elements") {
      assert(P09.pack(List[Int](99, 100, 99, 100, 101, 100, 100, 101, 101)) == List(List[Int](99), List[Int](100), List[Int](99), List[Int](100), List[Int](101), List[Int](100, 100), List[Int](101, 101)))
      assert(P09.packWithTailRecursive(List[Int](99, 100, 99, 100, 101, 100, 100, 101, 101)) == List(List[Int](99), List[Int](100), List[Int](99), List[Int](100), List[Int](101), List[Int](100, 100), List[Int](101, 101)))
    }
  }
}
