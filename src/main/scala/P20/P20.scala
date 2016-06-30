package P20

/**
  * Created by ueda on 2016/06/30.
  */
object P20 {
  def removeAt[T](n: Int, list: List[T]): (List[T], T) = list.splitAt(n) match {
    case (Nil, _) if n < 0 => sys.error("removeAt is not defined for negative index")
    case (first, x :: second) => (first ::: second, x)
    case (first, Nil) => sys.error("index larger than length of list")
  }
}
