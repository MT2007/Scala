package Demo

class Person{
  private var Fname: String=""
  private var Lname: String=""
  var taxToPay: Double  = 0
  def setFname(a: String){this.Fname = a}
  def setLname(a: String){this.Lname = a}
  def setTaxRate(a: Double){this.taxToPay = a}
  def getFname(): String = this.Fname
  def getLname(): String = this.Lname
}
trait Student extends Person{
  this.taxToPay = 0
}
trait Employee extends Person{
  this.taxToPay = 0.2
  var Salary: Double = 1000
  def setSalary(a: Double)
  def getSalary(): Double
  def getTaxToPay(): Double
}
trait Teacher extends Employee{
  this.taxToPay = 0.1
}

class student (a: String, b: String) extends Student{
  super.setFname(a)
  super.setLname(b)
  super.setTaxRate(0)
}
class teacher (a: String, b: String) extends Teacher{
  super.setFname(a)
  super.setLname(b)
  override def setSalary(a: Double): Unit = {this.Salary = a}
  override def getSalary(): Double = this.Salary
  override def getTaxToPay(): Double = return this.Salary*this.taxToPay
}
class employee (a: String, b: String) extends Employee{
  super.setFname(a)
  super.setLname(b)
  override def setSalary(a: Double): Unit = this.Salary = a
  override def getSalary(): Double = this.Salary
  override def getTaxToPay(): Double = this.Salary*this.taxToPay
}

object account {
  def main(args: Array[String]): Unit = {
    var p1 = new student("Mohammed", "Student")
    var p2 = new employee("Dan", "employee")
    var p3 = new teacher("Mohammed", "teacher")
    println(p1.getFname()+" "+p1.getLname()+" tax ammont is "+p1.taxToPay)
    println(p2.getFname()+" "+p2.getLname()+" tax ammont is "+p2.getTaxToPay())
    println(p3.getFname()+" "+p3.getLname()+" tax ammont is "+p3.getTaxToPay())
  }
}
