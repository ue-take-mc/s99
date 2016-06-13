package P08

import org.scalacheck.{Arbitrary, Gen, Prop, Properties}
import org.scalacheck.Prop.forAll

/**
  * Created by ueda on 2016/06/13.
  */
class P08Check extends Properties("P08") {
  def duplicates(list: List[Symbol]) : Int = {
    def loop(list: List[Symbol], curr: Symbol, count: Int) : Int = list match {
      case Nil => count
      case x::xs =>
        if (curr == x) loop(xs, curr, count + 1) else loop (xs, x, count)
    }
    list match {
      case x::xs => loop(xs, x, 0)
      case Nil => 0
    }
  }

  property("compress()") = {
    val gen = for {
      x <- Gen.choose[Symbol]('a, 'z)
      y <- Gen.choose(1, 10)
      s <- Gen.listOfN(y, implicitly[Arbitrary[Symbol]].arbitrary)
    } yield s

    Prop.forAll(gen) { case (x) =>
      P08.compress(x).length == x.length - duplicates(x)
    }
  }
}
