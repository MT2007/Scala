class Task1[A](E: A) {
  private var _E: A = E
  def getContent: A = _E
  def applyFunction(f: A => A): A =
  {
    _E = f(_E)
    return _E
  }
}

trait Maybe[A]
class No extends Maybe[Nothing]
class Yes[A](value: A) extends Maybe[A] {
  private var v: A = value
  def getContent: A = v
}

class Task3[A](E: A) {
  private var _E: A = E
  def getContent: A = _E

  def applyFunction(f: A => A): A =
  {
    if (f(_E).isInstanceOf[No])
      return _E
    else if (f(_E).isInstanceOf[Yes[_]]) {
      _E = f(_E).asInstanceOf[A]
      return _E
    } else
      return null.asInstanceOf[A];
  }
}

class Task4[A](E: A) {
  private var _E: A = E
  def getContent: A = _E
  def getOrElse[B]: B =
  {
    if (_E.isInstanceOf[No])
      return "class NO with no content".asInstanceOf[B]
    else if (_E.isInstanceOf[Yes[_]])
      return _E.asInstanceOf[Yes[A]].getContent.asInstanceOf[B]
    else
      return null.asInstanceOf[B];
  }
}

object Assignment_09 {
  def main(args: Array[String]): Unit = {
    println("Task_01:")
    val task1: Task1[String] = new Task1(" Hello Scala 01")
    task1.applyFunction(a => a + a)
    println(task1.getContent)

    println("Task_02:")
    var no: No = new No()
    println(no.isInstanceOf[Maybe[_]])
    var yes: Yes[String] = new Yes("a")
    println(yes.isInstanceOf[Maybe[_]])

    println("Task_03:")
    val task3no: Task3[No] = new Task3[No](new No())
    task3no.applyFunction(a => a)
    println(task3no.getContent)
    val task3yes: Task3[Yes[String]] = new Task3[Yes[String]](new Yes(" Hello "))
    task3yes.applyFunction(a => new Yes(a.getContent + a.getContent))
    println(task3yes.getContent.getContent)

    println("Task_04:")
    val task4no: Task4[No] = new Task4[No](new No())
    println(task4no.getOrElse)
    val task4yes: Task4[Yes[String]] = new Task4[Yes[String]](new Yes(" Hello Scala!"))
    println(task4yes.getOrElse)

  }
}
