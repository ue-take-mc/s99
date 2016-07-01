package P25

/**
  * Created by ueda on 2016/07/01.
  */
object P25 {
  import P23.P23.randomSelect

  def randomPermutate[T](list: List[T]): List[T] = {
    randomSelect(list.length, list)
  }
}
