package P08

/**
  * Created by ueda on 2016/06/13.
  */
object P08 {
  def compressWithTailRecursive(list: List[Int]) : List[Int] = {
    def compressFromTail(result : List[Int], xs: List[Int]): List[Int] = xs match {
      case x :: tail => compressFromTail(x :: result, tail.dropWhile(e => e == x))
      case Nil => result.reverse
    }
    compressFromTail(Nil, list)
  }

  def compressWithFoldRight(list: List[Int]) : List[Int] = {
    list.foldRight(List[Int]())((x, l) => {
      if (l.isEmpty || (l.head != x)) x :: l
      else l
    })
  }

  def compress(list: List[Int]) : List[Int] = list match {
    case Nil => Nil
    case x :: xs => x :: compress(xs.dropWhile(e => x == e))
  }
}
