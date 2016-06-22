package P13

/**
  * Created by tksued on 2016/06/22.
  */
object P13 {
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def encodeDirectResult(l: List[T], count: Int, result: List[(Int, T)]): List[(Int, T)] = l match {
      case Nil => Nil
      case x::xs if x == xs.head => encodeDirectResult(xs, count + 1, result)
      case x::xs => encodeDirectResult(xs, 0, (count, x) :: result)
    }
    encodeDirectResult(list, 0, List[(Int, T)]())
  }
}
