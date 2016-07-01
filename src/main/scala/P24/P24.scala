package P24

import scala.util.Random

/**
  * Created by ueda on 2016/07/01.
  */
object P24 {
  def lotto(n: Int, m: Int): List[Int] = {
    val random = new Random
    def lottoR(count: Int, result: List[Int]): List[Int] = {
      if (n < count) {
        val elementCandidate = random.nextInt(m + 1)
        if (result.contains(elementCandidate))
          lottoR(count, result)
        else
          lottoR(count + 1, result :+ elementCandidate)
      }
      else result
    }
    lottoR(0, List())
  }
}
