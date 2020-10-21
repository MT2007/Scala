package Demo

object absolute_value {
  def absin (a: Int): Int={
    if (a < 0)  a * -1
    else a
  }
  def abs(a: List[Int]): List[Int]= {
    var b = a.map(x => absin(x))
    return b
  }

  def main(args: Array[String]): Unit = {
    var lst = List(12,8,3,2,6,-5,0,-3,10,-1)
    println(abs(lst))
  }
}
