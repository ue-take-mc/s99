package P16

/**
  * Created by ueda on 2016/06/24.
  */
object P16 {
  def drop[T](n: Int, list: List[T]): List[T] = {
    def dropRest(n: Int, count: Int, rest: List[T]): List[T] = rest match {
      case x::xs if (count % n) == 0 => dropRest(n, 1, xs)
      case x::xs => x :: dropRest(n, count+1, xs)
      case _ => List()
    }
    list match {
      case x::xs if list.size < n => list
      case x::xs => dropRest(n, 1, list)
      case Nil => Nil
      case isEmpty => List()
    }
  }

  def dropWithTailRecursive[T](n: Int, list: List[T]): List[T] = {
    def dropResult(n: Int, count: Int, rest: List[T], result: List[T]): List[T] = rest match {
      case x::xs if (count % n) == 0 => dropResult(n, 1, xs, result)
      case x::xs => dropResult(n, count + 1, xs, result :+ x)
      case _ => result
    }
    list match {
      case x::xs => dropResult(n, 1, list, List())
      case Nil => Nil
      case isEmpty => List()
    }

  }

  def dropWithZipWithIndex[T](n: Int, list: List[T]): List[T] = {
    list.zipWithIndex.filter(e => ((e._2 + 1) % n) != 0).map(e => e._1)
  }
}
