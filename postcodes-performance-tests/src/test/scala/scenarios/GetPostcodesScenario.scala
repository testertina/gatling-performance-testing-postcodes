package test.scala.scenarios

import test.scala.requests.GetPostcodesRequest
import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder

object GetPostcodesScenario {
  val getPostcodesScenario: ScenarioBuilder = scenario("Get postcodes scenario")
    .exec(GetPostcodesRequest.get_postcodes)
}
