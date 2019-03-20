import java.io.{File, PrintWriter}
import scala.io.Source
import spray.json._
import scala.util.parsing.json._
import au.com.bytecode.opencsv.CSVWriter
import java.io.{BufferedWriter, FileWriter}
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer
import scala.util.Random


/**
  * Created by rohabhos on 20-03-2019.
  */
object IOParsingJson {
  def main(args: Array[String]) {
    val file = Source.fromFile("reserved.json" ).foreach {
      print
    }
    val outputFile = new BufferedWriter(new FileWriter("fileIO.csv")) //replace the path with the desired path and filename with the desired filename
    val csvWriter = new CSVWriter(outputFile)
    val csvFields = Array[String]("Name","Platform","Current_Reservation","Required_Reservation","Instance_id")
    val random = new Random()
    var listOfRecords = new ListBuffer[Array[String]]()
    listOfRecords += csvFields
  csvWriter.writeAll(listOfRecords.toList)
  outputFile.close()

  }
}
