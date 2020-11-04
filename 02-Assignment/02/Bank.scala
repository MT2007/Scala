package Demo
class BankAccount(var name: String, Balance: Int = 0){
  private var currentBalance: Int = Balance

  def deposits(bal: Int){
    this.currentBalance = this.currentBalance + bal
  }
  def withdraw(bal: Int){
    if (this.currentBalance <= 0) {
      throw new Error("Not sufficient for this operation! please make a deposit. have a nice day!")
    }
    this.currentBalance = this.currentBalance - bal
  }
  def getcurrentBalance(): Int = {
    return this.currentBalance
  }
}

object Bank {
  def main(args: Array[String]): Unit = {
    var act1 = new BankAccount("Moh")
    var act2 = new BankAccount("Saeed", 9999)
    println("Mr."+act1.name+", your current bank account balance is " +act1.getcurrentBalance())
    println("Mr."+act2.name+", your current bank account balance is " +act2.getcurrentBalance())
    act1.deposits(1000)
    act1.deposits(1000)
    act1.withdraw(500)
    println("After deposit & withdraw account")
    println("Mr."+act1.name+", your current bank account balance is " +act1.getcurrentBalance())
  }
}
