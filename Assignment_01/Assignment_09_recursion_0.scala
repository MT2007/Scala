package Demo

object recursion_0 {
  def recur_0(a: List[Int]): List[Int]= {
    var b:List[Int] = List()
    recur_00(b, a)
  }
  def recur_00(b: List[Int], a: List[Int]): List[Int] = {
    var acc: List[Int] = b
    if (!a.isEmpty) {
      if (a.head != 0) {
        acc = a.head :: acc
        recur_00(acc, a.tail)
      } else
        recur_00(acc, a.tail)
    } else acc.reverse
  }

  def main(args: Array[String]): Unit = {
    var lst = List(0,12,34,66,0,6,89,0,45,39,99,0,19,0)
    println(recur_0(lst))
  }
}
