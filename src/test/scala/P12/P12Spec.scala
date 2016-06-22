package P12

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by ueda on 2016/06/22.
  */
class P12Spec extends FunSpec with DiagrammedAssertions {
  describe("P12") {
    it("list contains no elements") {
      assert(P12.decode(List[(Int, Int)]()) == List[Int]())
      assert(P12.decode2(List[(Int, Int)]()) == List[Int]())
    }
    it("list contains one element") {
      assert(P12.decode(List[(Int,Int)]((2, 99))) == List(99,99))
      assert(P12.decode2(List[(Int,Int)]((2, 99))) == List(99,99))
    }
    it("list contains two elements") {
      assert(P12.decode(List[(Int,Int)]((2, 99), (3,100))) == List(99,99,100,100,100))
      assert(P12.decode2(List[(Int,Int)]((2, 99), (3,100))) == List(99,99,100,100,100))
    }
    it("list contains many elements") {
      assert(P12.decode(List[(Int,Int)]((2, 99), (3,100), (1, 101), (5, 1000))) == List(99,99,100,100,100,101,1000,1000,1000,1000,1000))
      assert(P12.decode2(List[(Int,Int)]((2, 99), (3,100), (1, 101), (5, 1000))) == List(99,99,100,100,100,101,1000,1000,1000,1000,1000))
    }
  }
}
