package Demo

object greetings {

  def sendgreet(x: Any): String = {
    x match {
      case Person(first, "Mws") => s"found Mws, first name = $first"
      case Person(first, "smith") => s"found smith, first name = $first"
      case _ => "Not Found"
    }
  }

  case class Person(fname:String,lname:String ) {
    var fName: String = fname
    var lName: String = lname
  }

  def main(args: Array[String]): Unit = {
    val p1= new Person("Moh", "Mws")
    var p2 = new Person("Jon", "smith")
    println(sendgreet(p1))
  }
}
