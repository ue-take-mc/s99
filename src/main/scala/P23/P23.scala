package P23

import scala.util.Random

/**
  * Created by ueda on 2016/07/01.
  */
object P23 {
  import P20.P20.removeAt

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    if (n <= 0) List()
    else {
      val (rest, elem) = removeAt((new Random).nextInt(list.length), list)
      elem :: randomSelect(n - 1, rest)
    }
  }
}
