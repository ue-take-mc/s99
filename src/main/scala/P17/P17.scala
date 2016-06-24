package P17

/**
  * Created by ueda on 2016/06/24.
  */
object P17 {
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    def splitRecursive(n: Int, rest: List[T], result: (List[T], List[T])): (List[T], List[T]) = rest match {
      case x::xs if result._1.size < n => splitRecursive(n, xs, (result._1 :+ x, result._2))
      case x::xs => splitRecursive(n, xs, (result._1, result._2 :+ x))
      case _ => result
    }
    splitRecursive(n, list, (List[T](), List[T]()))
  }

  def splitWithDropAndTake[T](n: Int, list: List[T]): (List[T], List[T]) = (list.take(n), list.drop(n))
}
