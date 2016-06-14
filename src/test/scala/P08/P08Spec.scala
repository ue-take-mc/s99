package P08

import org.scalatest.{FunSpec, DiagrammedAssertions}
/**
  * Created by tksued on 2016/06/14.
  */
class P08Spec extends FunSpec with DiagrammedAssertions {
  describe("P08") {
    it("list contains no elements") {
      assert(P08.compress(List[Int]()) == List[Int]())
      assert(P08.compressWithFoldRight(List[Int]()) == List[Int]())
      assert(P08.compressWithTailRecursive(List[Int]()) == List[Int]())
    }
    it("list contains one element") {
      assert(P08.compress(List[Int](99)) == List[Int](99))
      assert(P08.compressWithFoldRight(List[Int](99)) == List[Int](99))
      assert(P08.compressWithTailRecursive(List[Int](99)) == List[Int](99))
    }
    it("list contains two same elements") {
      assert(P08.compress(List[Int](99,99)) == List[Int](99))
      assert(P08.compressWithFoldRight(List[Int](99,99)) == List[Int](99))
      assert(P08.compressWithTailRecursive(List[Int](99,99)) == List[Int](99))
    }
    it("list contains two different elements") {
      assert(P08.compress(List[Int](99,100)) == List[Int](99,100))
      assert(P08.compressWithFoldRight(List[Int](99,100)) == List[Int](99,100))
      assert(P08.compressWithTailRecursive(List[Int](99,100)) == List[Int](99,100))
    }
    it("list contains many elements") {
      assert(P08.compress(List[Int](99,100,99,100,101,100,100,101,101)) == List[Int](99,100,99,100,101,100,101))
      assert(P08.compressWithFoldRight(List[Int](99,100,99,100,101,100,100,101,101)) == List[Int](99,100,99,100,101,100,101))
      assert(P08.compressWithTailRecursive(List[Int](99,100,99,100,101,100,100,101,101)) == List[Int](99,100,99,100,101,100,101))
    }
  }
}
