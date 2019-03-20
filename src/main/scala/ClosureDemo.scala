/**
  * Created by rohabhos on 20-03-2019.
  */
class ClosureDemo {
  val firstNumber = 10
  val secondNumber = 10

  def calculateResult:Int={   //returns an integer value , Unit returns nothing so if using Unit,and this function
  // is called within println() method it prints () i.e unit
    val result = firstNumber + secondNumber
    result  //last executed statement is returned to the function
  }
}

object closure extends App{
  val obj = new ClosureDemo
  println(obj.calculateResult)
}