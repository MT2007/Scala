package Demo

object Assignment_02 {

  def myrecursive ( a: List[String]): String = {
  if (a.isEmpty) ""
    else a.head +","+ myrecursive(a.tail)
  }

  def myrecursiveR ( a: List[String]): String = {
    if (a.isEmpty) ""
    else a.reverse.head +","+ myrecursive(a.reverse.tail)
  }

  def main(args: Array[String]): Unit = {
    var days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(myrecursive(days))
    println(myrecursiveR(days))
  }

}
