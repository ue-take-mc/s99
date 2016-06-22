package P13

/**
  * Created by tksued on 2016/06/22.
  */
object P13 {
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def encodeDirectResult(pre: T, count: Int, result: List[T]): List[(Int, T)] = result match {
      case x::xs if pre == x => encodeDirectResult(pre, count + 1, xs)
      case x::xs => (count, pre)::encodeDirectResult(x, 1, xs)
      case _ => List((count, pre))
    }
    list match {
      case x :: xs => encodeDirectResult(x, 1, xs)
      case _ => List()
    }
  }
}
