/**
  * Created by rohabhos on 15-03-2019.
  */
class RecDemo {         //Recusive function for finding the factorial of any number (Recursion-Demo)
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      val result = n * factorial(n-1)
      result
    }
}

object Factorial extends App{
  val fact = new RecDemo
  println(fact.factorial(5555555))
}