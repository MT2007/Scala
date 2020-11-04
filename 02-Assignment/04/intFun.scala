package Demo

object intFun {
  def myfun2(x: Int, f: (Int) => Int): Int = f(f(f(x)))

def main(args: Array[String]): Unit= {
  var result4 = myfun2(20, (a)=>a+2)
println(result4)

  }
}
