package Demo

object tuple {
  def myfun(a: Tuple3[Int,String,Boolean]): Unit ={
    println(a)
  }

  def main(args: Array[String]): Unit = {
    var t = new Tuple3(23,"Moh",true)
    myfun(t)
  }
}
