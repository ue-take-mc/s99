package P07

/**
  * Created by tksued on 2016/06/11.
  */
object P07 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case x : List[_] => flatten(x)
    case e => List(e)
  }
}
