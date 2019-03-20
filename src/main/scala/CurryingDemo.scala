/**
  * Created by rohabhos on 20-03-2019.
  */
class CurryingDemo {  //Example for currying function
  def add(a:Int,b:Int)(c:Int):Int={
    val result = a+b+c
    result
  }
}

object Main extends App{
  val addition = new CurryingDemo
  val resultOne = addition.add(10,20)(_)
 // val resultTwo = addition.add(_,20)(10) //why wildcard at first position is not working ???
  println("addition is: "+resultOne(30))
  //println("addition is: "+resultTwo(10))
}
