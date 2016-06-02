package P02

/**
  * Created by tksued on 2016/05/14.
  */
object P02 {
  def penultimate[T](list: List[T]): T = list match {
    case x::_::Nil => x
    case _::y::xs => penultimate(y::xs)
    case _ => sys.error("penultimate is not defined for lists less than two elements")
  }
}
