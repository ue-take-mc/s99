package P05

/**
  * Created by ueda on 2016/06/09.
  */
object P05 {
  def reverse[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]())((acc, x) => x :: acc)
  }

  def reverseByFoldRight[T](list: List[T]): List[T] = {
    list.foldRight(List[T]())((x, acc) => acc ++ List[T](x))
  }
}
