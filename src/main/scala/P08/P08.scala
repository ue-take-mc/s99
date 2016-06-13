package P08

/**
  * Created by ueda on 2016/06/13.
  */
object P08 {
  def compressWithTailRecursive(list: List[Symbol]) : List[Symbol] = {
    def compressFromTail(result : List[Symbol], xs: List[Symbol]): List[Symbol] = xs match {
      case x :: tail => compressFromTail(x :: tail, tail.dropWhile(e => e == x))
      case Nil => xs.reverse
    }
    compressFromTail(Nil, list)
  }

  def compressWithFoldRight(list: List[Symbol]) : List[Symbol] = {
    list.foldRight(List[Symbol]())((x, l) => {
      if (l.isEmpty || (l.head != x)) x :: l
      else l
    })
  }

  def compress(list: List[Symbol]) : List[Symbol] = list match {
    case Nil => Nil
    case x :: xs => x :: compress(xs.dropWhile(e => x == e))
  }
}
