package P07

import org.scalacheck.{Prop, Properties}

/**
  * Created by tksued on 2016/06/12.
  */
class P07Check extends Properties("P07") {
  property("flatten()") = {
    Prop.forAll { (list: List[List[Int]]) =>
      P07.flatten(list) == list.flatten
    }
  }

  property("flatten2()") = {
    Prop.forAll { (list: List[List[Int]]) =>
      P07.flatten2(list) == list.flatten
    }
  }
}
