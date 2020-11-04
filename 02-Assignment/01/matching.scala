package Demo

import scala.io.StdIn.readLine

object matching {
def checkday(a: String): Unit={
  a match {
    case "Sunday" | "Saturday" => println("weekend")
    case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => println("work")
    case _ => println("no such day")
  }
}

def main(args: Array[String]): Unit ={
  println("if you want to end the program print the word end")
  while (readLine() != "end"){
    checkday(readLine())
  }
  }
}
