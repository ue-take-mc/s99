package P04

/**
  * Created by ueda on 2016/06/07.
  */
object P04 {
  def size[T](list: List[T]): Int = list match {
    case x::xs => 1 + size(xs)
    case Nil => 0
  }

  def sizeByTailRecursive[T](list: List[T]): Int = {
    def sizeFromTail(count: Int, list: List[T]): Int = list match {
      case Nil => count
      case x::xs => sizeFromTail(count + 1, xs)
    }
    sizeFromTail(0, list)
  }
}
