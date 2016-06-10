package P06

import org.scalatest.{DiagrammedAssertions, FunSpec}
/**
  * Created by ueda on 2016/06/10.
  */
class P06Spec extends FunSpec with DiagrammedAssertions {
  describe ("P06") {
    it ("for palindrome list whose element num is odd") {
      assert(P06.isPalindrome(List(1,2,3,4,5,4,3,2,1)))
    }
    it ("for palindrome list whose element num is even") {
      assert(P06.isPalindrome(List(1,2,3,4,5,5,4,3,2,1)))
    }
    it ("for non-palindrome list") {
      assert(!P06.isPalindrome(List(1,2,3,4,5,4,3,2)))
    }
  }
}
