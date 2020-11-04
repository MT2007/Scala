package Demo
class BankAccount(var name: String, var Balance: Int, var initialBalance: Int){

  def  this(a: String){
    this(a , 0, 0)
  }
  def this(a: String, b: Int){
    this(a, b, b)
  }

  def deposits(bal: Int){
    Balance = Balance + bal
  }
  def withdraw(bal: Int){
    Balance = Balance - bal
  }
  def currentBalance(){
    Balance
  }
}

object Bank {
  def main(args: Array[String]): Unit = {
    var act1 = new BankAccount("Moh",30)
    println(act1.name)
    act1.deposits(1000)
    act1.deposits(1000)
    act1.withdraw(500)
    println(act1.Balance)
    println(act1.initialBalance)
  }

}
