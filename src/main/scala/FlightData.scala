/* SimpleApp.scala */
import org.apache.spark-3.2.1.SparkContext
import org.apache.spark-3.2.1.SparkContext._
import org.apache.spark-3.2.1.SparkConf
import spark.implicits._
// val spark = SparkSession.builder().appName("Flight Data").master("local").getOrCreate

object FlightData {
  def main(args: Array[String]) {
    println("hello")
    val df = spark.read.csv("data/flightData.csv")  
  }
}