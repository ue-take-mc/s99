package P19

/**
  * Created by ueda on 2016/06/29.
  */
object P19 {
  def rotate[T](n: Int, list: List[T]): List[T] = {
    if (list.isEmpty) return List[T]()
    val realPosition = if ((n % list.length) < 0) n + list.length else n % list.length
    list.drop(realPosition) ::: list.take(realPosition)
  }
}
