package P26

/**
  * Created by ueda on 2016/07/01.
  */
object P26 {
  def permutationsByN[T](n: Int, list: List[T]): List[List[T]] = {
    if (n <= 1) list.map(e => List(e))
    else {
      val temp: List[List[Any]] = permutationsByN(n - 1, list).map(s => addElementNotIncluded(1, s))
      list.map(e => List(e))
    }
  }
  def addElementNotIncluded[T](e: T, list: List[T]): List[T] = {
    if (!list.contains(e)) list :+ e else Nil
  }
  def combinations[T:Ordering](n: Int, list: List[T]): List[List[T]] = {
    permutationsByN(n, list).map(e => e.sorted).distinct
  }
}
