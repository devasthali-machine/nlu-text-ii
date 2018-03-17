package alexasuncle

import java.util

object AlexasUncle {

  def main(args: Array[String]): Unit = {

    val data = Map("displayText" -> "Welcome to Alexas uncle",
      "services" -> List(
        "Buy music", "sell music", "Create music"
      ))

    val dataIn = new java.util.HashMap[String, Object]() {
      {
        put("displayText", "Welcome to Alexas uncle")
        put("services", util.Arrays.asList("Buy music", "sell music", "create music"))
      }
    }

    //WelcomeProcessor.process(dataIn)

    PurchaseItemProcessor.process(new java.util.HashMap[String, Object]() {
      {
        put("displayText", "Welcome to Alexas uncle")
        put("items", util.Arrays.asList("umbrella", "tv", "walkmen"))
      }
    })

  }
}
