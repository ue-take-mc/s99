package P18

/**
  * Created by ueda on 2016/06/28.
  */
object P18 {
  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    def sliceRecursive(index: Int, rest: List[T], result: List[T]): List[T] = rest match {
      case x::xs if (i <= index) && (index < k) => sliceRecursive(index + 1, xs, result :+ x)
      case x::xs if index >= k => result
      case x::xs => sliceRecursive(index + 1, xs, result)
      case _ => result
    }
    sliceRecursive(0, list, List())
  }
}
