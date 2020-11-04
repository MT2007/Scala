package Demo
class Person(Fname: String, Lname: String){
  def Fname(): String= {return Fname}
  def Lname(): String= {return Lname}
}

object greetings {

  def sendgreeting(a: Person): Unit= {
    a.Fname() match {
      case "Moh" => println("Good day " + a.Fname())
      case _ => a.Lname() match {
        case "Smith" => printf("Nice to meet you Mr. %s \n",a.Lname())
        case _ => printf("hello Mr. %s %s", a.Fname(), a.Lname())
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val p1= new Person("Moh", "Mws")
    var p2 = new Person("Jon", "Smith")
    var p3 = new Person("Dan", "White")
    sendgreeting(p1)
    sendgreeting(p2)
    sendgreeting(p3)
  }
}
