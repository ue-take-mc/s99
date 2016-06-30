package P21

/**
  * Created by ueda on 2016/06/30.
  */
object P21 {
  def insertAt[T](element: T, n: Int, list: List[T]): List[T] = {
    def insertRecursive(count: Int, rest: List[T], result: List[T]): List[T] = rest match {
      case x::xs if count == n => insertRecursive(count + 1, xs, result :+ element :+ x)
      case x::xs => insertRecursive(count + 1, xs, result :+ x)
      case Nil => result
    }
    insertRecursive(0, list, List())
  }

  def insertAtBySplit[T](element: T, n: Int, list: List[T]): List[T] = list.splitAt(n) match {
    case (first, second) if n >= list.length => List()
    case (first, second) if n < 0 => list
    case (first, second) => first ::: element :: second
  }
}
