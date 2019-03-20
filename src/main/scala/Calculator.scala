/**
  * Created by rohabhos on 15-03-2019.
  */
class Calculator {
  def addition(firstNumber:Int,secondNumber:Int)={
    val result = firstNumber+secondNumber;
    println(result);
  }

  def subtraction(firstNumber: Int,secondNumber:Int)={
    val sub = secondNumber - firstNumber
    println(sub)
  }

  def multiplication(firstNumber: Int,secondNumber:Int)={
    val multiply = secondNumber*firstNumber
    println(multiply)
  }

  def division(firstNumber:Int,secondNumber:Int){
    val div = secondNumber / firstNumber
    println(div)
  }

  def remainder(firstNumber:Int,secondNumber:Int){
    val rem = secondNumber%firstNumber
    println(rem)
  }
}

object Calculate extends App{
  val cal = new Calculator
  cal.addition(10,10)
  cal.subtraction(10,20)
  cal.multiplication(10,20)
  cal.division(10,20)
  cal.remainder(2,3)
}