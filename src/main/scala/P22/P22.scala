package P22

/**
  * Created by ueda on 2016/06/30.
  */
object P22 {
  def range(start: Int, end: Int): List[Int] = {
    def rangeRecursive(n: Int, result: List[Int]): List[Int] = {
      if (start <= n && n <= end)
        rangeRecursive(n + 1, result :+ n)
      else if (n < start)
        rangeRecursive(n + 1, result)
      else
        result
    }
    rangeRecursive(0, List())
  }
}
