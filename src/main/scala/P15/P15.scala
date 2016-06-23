package P15

import util.Util
/**
  * Created by ueda on 2016/06/23.
  */
object P15 {
  def duplicateN[T](n: Int, list: List[T]): List[T] = {
    list.flatMap{e => Util.tupleToList(n, e)}
  }
}
