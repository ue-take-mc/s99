package P06

/**
  * Created by ueda on 2016/06/10.
  */
object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    list.reverse == list
  }
}
