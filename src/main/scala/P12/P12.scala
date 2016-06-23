package P12

import util.Util
/**
  * Created by ueda on 2016/06/22.
  */
object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    def decodeRest(s: List[(Int, T)], result: List[T]): List[T] = s match {
      case Nil => result
      case x::xs => decodeRest(xs, result ::: Util.tupleToList(x._1, x._2))
    }
    decodeRest(list, List())
  }

  def decode2[T](list: List[(Int, T)]): List[T] =
    list.flatMap(e => Util.tupleToList(e._1, e._2))
}
