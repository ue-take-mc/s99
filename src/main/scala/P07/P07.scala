package P07

/**
  * Created by tksued on 2016/06/11.
  */
object P07 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case x : List[_] => flatten(x)
    case e => List(e)
  }

  def flatten2(list: List[Any]): List[Any] = list match {
    case (x : List[_]) :: xs => flatten2(x) ::: flatten2(xs)
    case x :: xs => x :: flatten2(xs)
    case Nil => Nil
  }
}
