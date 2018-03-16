package alexasuncle


import java.io.{File, FileWriter}
import java.util

import freemarker.template.Configuration

import scala.collection.JavaConverters._

case class Service(name: String)

object WelcomeProcessor {

  val cfg = new Configuration()
  private val template = cfg.getTemplate("src/templates/welcome.ftl")

  def process(data: util.Map[String, Object]) {

    val templateOutput = new FileWriter(new File("welcome.json"))

    //val dataIn: util.Map[String, Object] = data.asJava

    template.process(data, templateOutput)

    templateOutput.flush()
    templateOutput.close()

  }

}
