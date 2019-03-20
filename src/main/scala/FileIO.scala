/**
  * Created by rohabhos on 20-03-2019.
  */
import java.io._
import scala.io.Source

object FileIO {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("IO.txt" ))

    writer.write("Hello Ankita......")
    writer.close()

    Source.fromFile("IO.txt" ).foreach {
      print
    }
 }
}
