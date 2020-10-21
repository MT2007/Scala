package Demo

object Option {
  def main(args: Array[String]): Unit = {
    var mylist = List(1,2,3,4,5)
    var mymap = Map(1 -> "Moh", 2 -> "Thu", 3 -> "Dan")
    var opt: Option[Int] = Some(122)
    var opt2: Option[Int] = None
    println(mylist.find( _ > 2 ))
    println(mylist.find( _ > 2 ).get)
    println(mylist.find( _ > 9 ))
    println(mylist.find( _ > 9 ).getOrElse("000"))
    println(mymap.get(2))
    println(mymap.get(2).get)
    println(mymap.get(4))
    println(mymap.get(4).getOrElse("not exists"))
    println(opt.isEmpty)
    println(opt2.isEmpty)
  }
}
