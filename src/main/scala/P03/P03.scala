package P03

/**
  * Created by tksued on 2016/05/28.
  */
object P03 {
  def nth[T](n: Int, list: List[T]): T = list match {
    case x::_ if n == 0 => x
    case _::xs if n > 0 => nth(n - 1, xs)
    case _ => throw new NoSuchElementException
  }
}
