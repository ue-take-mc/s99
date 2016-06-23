package P14

/**
  * Created by ueda on 2016/06/23.
  */
object P14 {
  def duplicate[T](list: List[T]): List[T] = {
    list.flatMap(e => List(e, e))
  }
}
