/**
  * Created by rohabhos on 20-03-2019.
  */
/**
  *
  * If both class and object name is same, then the object is called as the companion for that class
  * object allows to access its methods without creating new instance acts as static,methods can be directly accessed
  * using Object name only
  */
class DefaultArgs( val name:String = "Ankita", val age:Int = 23) {// if we don't specify types val or var then the
  // variables can't be accessed directly outside the class. Requires getter and setter to use those variables.
  //default argumented constructor (primary constructor)

  println(s"My name is $name and i am $age years old !!!") //all the statements inside class gets executed everytime
  // when new instance is created

  def getName = println("My name is " +name)  //If we don't specify the returntype then by default it is Unit()

  def this(name:String)={   //auxiliary constructor with only one parameter
    this(name,23)
  }
}

object DefaultArgs extends App{
  val ankita = new DefaultArgs()
  val ankee = new DefaultArgs("Ankee")
  println("Hello myself ankee and i am using auxiliary constructor with one parameter " +ankee.name)
  println(ankita.age)
  ankita.getName
}