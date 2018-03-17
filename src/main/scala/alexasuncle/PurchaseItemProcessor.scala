package alexasuncle

import java.io.{File, FileWriter}
import java.util

import freemarker.template.Configuration

object PurchaseItemProcessor {

  val cfg = new Configuration()
  private val template = cfg.getTemplate("src/templates/purchase.ftl")

  def process(data: util.Map[String, Object]) {

    val templateOutput = new FileWriter(new File("responses/purchase.json"))

    template.process(data, templateOutput)

    templateOutput.flush()
    templateOutput.close()

  }

}
