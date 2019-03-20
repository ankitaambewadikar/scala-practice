import scala.annotation.tailrec

/**
  * Created by rohabhos on 15-03-2019.
  */
class TailRecDemo {
  def factorialUsingTailRecursion(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression
    factorialHelper(n, 1)
  }
}

object TailRecursion extends App{
  val tailRec = new TailRecDemo
  println(tailRec.factorialUsingTailRecursion(555))
}