package P01

/**
  * Created by tksued on 2016/05/14.
  */
object P01 {
  def last[T](list: List[T]) : T = list match {
    case x::Nil => x
    case x::xs => last(xs)
    case _ => sys.error("last is not defined for empty list.")
  }
}
