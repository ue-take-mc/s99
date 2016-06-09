package P03

/**
  * Created by tksued on 2016/05/28.
  */
object P03 {
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, x::_) => x
    case (h, _::xs) => nth(h - 1, xs)
    case (_, Nil) => throw new NoSuchElementException
  }
}
