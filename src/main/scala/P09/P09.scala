package P09

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

  def packWithTailRecursive[T](list: List[T]) : List[List[T]] = {
    def packRecursive(s : List[T], rest: List[T]): List[List[T]] = rest match {
      case x :: xs if x == s.head => packRecursive(x :: s, xs)
      case x :: xs => s :: packRecursive(List(x), xs)
      case Nil => s :: Nil

    }
    list match {
      case Nil => Nil
      case x :: xs => packRecursive(List(x), xs)
    }
  }
}
