import org.mmoon.scalatra.Redirector
import org.scalatra._

import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new Redirector, "/*")
  }
}
