package Demo

object tail_recursive {

  def myrecursivelstR (lst: List[String]) : String= {
    myrecursivelstRR("", lst)
  }
  def myrecursivelstRR(a: String, lst: List[String]) : String= {
    if (lst.isEmpty) a
    else {
      var acc = a + lst.head + ","
      myrecursivelstRR(acc, lst.tail)
    }
  }

  def main(args: Array[String]): Unit = {
    var days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(myrecursivelstR(days))
  }
}
