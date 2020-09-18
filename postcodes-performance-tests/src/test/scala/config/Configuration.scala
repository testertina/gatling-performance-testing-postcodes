package test.scala.config

import com.typesafe.config._

//This is where you set configuration values for the project
object Configuration {

  val baseUrl: String = "http://api.postcodes.io"
  val users: Int = Integer.getInteger("users", 1).toInt
  val rampup: Int = Integer.getInteger("rampup", 1).toInt
}
