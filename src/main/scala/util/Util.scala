package util

/**
  * Created by ueda on 2016/06/23.
  */
object Util {
  def tupleToList[T](x : Int, s : T): List[T] = {
    def tupleToListWithTailRecursive(x: Int, s: T, result: List[T]): List[T] = x match {
      case 0 => result
      case _ => tupleToListWithTailRecursive(x - 1, s, s :: result)
    }
    tupleToListWithTailRecursive(x, s, List())
  }
}
