package Demo

object Assignment_01 {
  def commfor1 (a: List[String]) : String = {
    var result: String = ""
    var lst = a
    var i = lst.length - 1
    var j = 0

    for (x <- lst){
      if (j != i) {
        j += 1
        result = result + x + ","
      } else
        result = result + x
    }
    return result
  }

  def commfor2 (a: List[String]) : String = {
    var result: String = ""
    var lst = a
    var i = lst.length - 1
    var j = 0

    for (x <- lst){
      if (j != i) {
        j += 1
        if (x.toList.head.equals('S')) {
          result = result + x + ","
        }
      } else {
        if (x.toList.head.equals('S')) {
          result = result + x
        }
      }
    }
    return result
  }

  def commwhile (a: List[String]) : String = {
    var result: String = ""
    var lst = a
    var i = lst.length - 1
    var j = 0

    while (j <= i){
      if (j == i) {
        result = result + lst(j)
        j += 1
      } else
        result = result + lst(j) + ","
      j += 1
    }
    return result
  }

  def main(args: Array[String]): Unit = {
    var days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(commfor1(days))
    println(commfor2(days))
    println(commwhile(days))

  }
}
