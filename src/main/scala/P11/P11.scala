package P11

import P09.P09

/**
  * Created by ueda on 2016/06/22.
  */
object P11 {
  def encodeModified[T](list: List[T]): List[Any] = {
    P09.packWithTailRecursive(list).map(e => if (e.length == 1) e.head else (e.length, e.head))
  }
}
