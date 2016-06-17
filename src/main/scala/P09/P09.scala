package P09

import scala.collection.immutable

/**
  * Created by ueda on 2016/06/17.
  */
object P09 {
  def pack[T](list: List[T]) : List[List[T]] =  {
    if (list.isEmpty) List(List())
    else {
      val (head, rest) = list.span(n => n == list.head)
      if (rest == Nil) List(head)
      else head :: pack(rest)
    }
  }
}
