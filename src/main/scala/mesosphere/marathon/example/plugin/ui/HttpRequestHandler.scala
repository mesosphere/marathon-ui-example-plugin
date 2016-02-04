package mesosphere.marathon.example.plugin.ui

import mesosphere.marathon.plugin.http.{HttpRequest, HttpRequestHandlerBase, HttpResponse}
import org.slf4j.LoggerFactory

class HttpRequestHandler extends HttpRequestHandlerBase {

  val log = LoggerFactory.getLogger(getClass)

  override def serve(request: HttpRequest, response: HttpResponse): Unit = request.method match {
    case "GET" => serveResource("/META-INF/resources/marathon-ui-example-plugin/" + request.requestPath, response)
  }
}
