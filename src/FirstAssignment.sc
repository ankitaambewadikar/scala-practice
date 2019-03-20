object Main {
  val msg = "Hi from Scala..."
  def add(x:Int,y:Int):Int= x + y
  add(10,10)
  val res = new Test
  val mult=res.mult(10,5)
  class Test{
    def mult(x:Int,y:Int):Int = x * y
  }
}
