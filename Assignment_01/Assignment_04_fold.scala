package Demo

object fold {
  def foldl(a: List[String]): String= {
    var h = a.head
    var t = a.tail.foldLeft(h)(_+","+_)
    return t
  }
  def foldr(a: List[String]): String= {
    var h = a.reverse.head
    var t = a.reverse.tail.reverse.foldRight(h)(_+","+_)
    return t
  }

  def commfor2 (a: List[String]) : List[Char] = {
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
    return result.toList
  }

  def foldlS(b: List[String]): String= {
    var a = commfor2(b)
    var h = a.head.toString
    var t = a.tail.foldLeft(h)(_+_)
    return t.toString
  }

  def foldlS2 (a: List[String]) : String= {
    var b = a.filter(i => i.head.equals('S')).foldLeft("")(_+","+_).tail
    return b
  }

  def main(args: Array[String]): Unit = {
    var days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(foldl(days))
    println(foldr(days))
    println((foldlS(days)))
    println(foldlS2(days))
  }
}
