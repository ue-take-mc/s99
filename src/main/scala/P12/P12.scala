package P12

/**
  * Created by ueda on 2016/06/22.
  */
object P12 {
  def tupleToList[T](x : Int, s : T): List[T] = {
    def tupleToListWithTailRecursive(x: Int, s: T, result: List[T]): List[T] = x match {
      case 0 => result
      case _ => tupleToListWithTailRecursive(x - 1, s, s :: result)
    }
    tupleToListWithTailRecursive(x, s, List())
  }

  def decode[T](list: List[(Int, T)]): List[T] = {
    def decodeRest(s: List[(Int, T)], result: List[T]): List[T] = s match {
      case Nil => result
      case x::xs => decodeRest(xs, result ::: tupleToList(x._1, x._2))
    }
    decodeRest(list, List())
  }

  def decode2[T](list: List[(Int, T)]): List[T] =
    list.flatMap(e => tupleToList(e._1, e._2))
}
