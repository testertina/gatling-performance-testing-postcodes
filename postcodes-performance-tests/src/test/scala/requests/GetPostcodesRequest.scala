package test.scala.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import test.scala.config.Configuration.baseUrl

object GetPostcodesRequest {
  var get_postcodes: HttpRequestBuilder = http("Get Postcodes")
    .post(baseUrl + "/postcodes")
    .body(RawFileBody("./src/test/resources/bodies/GetPostcodes.json")).asJson
    .header("content-type", "application/json")
    .check(status is 201)
}
