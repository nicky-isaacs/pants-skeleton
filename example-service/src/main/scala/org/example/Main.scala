package org.example

import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http
import com.twitter.util.{Future, Await}

object Main {
  
  def main(args: Array[String]): Unit = {
    val server = Http.serve(":8080", Service.const(Future.exception(new RuntimeException("Not working"))))
    Await.result(server)
  }

}
