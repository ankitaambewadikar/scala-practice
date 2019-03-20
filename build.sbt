name := "Demo"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies += "io.spray" %%  "spray-json" % "1.3.5"
libraryDependencies += "com.metamx" %% "scala-util" % "1.13.6"
libraryDependencies += "com.opencsv" % "opencsv" % "3.3"
libraryDependencies += "au.com.bytecode" % "opencsv" % "2.4"

libraryDependencies ++= Seq(
    "org.apache.spark" % "spark-core_2.10" % "1.6.1",
    "org.apache.spark" % "spark-sql_2.10" % "1.6.1",
    "org.apache.spark" % "spark-streaming_2.10" % "1.6.1",
    "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.6.3",
    "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
	
)


