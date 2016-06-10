package P06

import org.scalacheck.{Arbitrary, Prop, Properties}

/**
  * Created by ueda on 2016/06/10.
  */
class P06Check extends Properties("P06") {
  property("isPalindrome()") = {
    val listGen = for {
      xs <- Arbitrary.arbitrary[List[Int]]
    } yield xs ++ xs.reverse

    Prop.forAll(listGen) { case x =>
      P06.isPalindrome(x)
    }
  }
}
