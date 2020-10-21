package Demo

object increase {
  def incrs(a: List[Int]): List[Int]= {
    a.flatMap(x => List(x+1))
  }

  def main(args: Array[String]): Unit = {
    var lst = List(1,2,3,4,5)
    println(incrs(lst))
  }
}
