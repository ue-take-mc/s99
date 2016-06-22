package P10

import P09.P09

/**
  * Created by ueda on 2016/06/21.
  */
object P10 {
  def encode[T](list: List[T]) : List[Any] = {
    P09.packWithTailRecursive(list).map(e => (e.size, e.head))
  }
}
