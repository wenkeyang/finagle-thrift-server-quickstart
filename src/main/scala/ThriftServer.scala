package com.example

import java.net.InetSocketAddress
import org.apache.thrift.protocol.TBinaryProtocol

import com.twitter.util.{ Await, Future }
import com.twitter.finagle.example.thriftscala.{ Hello }
import com.twitter.finagle.Thrift
import com.twitter.finagle.ThriftMux
import com.twitter.finagle.thrift.ThriftServerFramedCodec
import com.twitter.finagle.builder.{ ServerBuilder, Server }

object ThriftServer {

  def main(args: Array[String]) {
    val server = Thrift.server.serveIface("0.0.0.0:8081", new Hello[Future] {
      def hi() = {
        println("called hi")
        Future("hi")
      }
    })
    Await.ready(server)
  }
}
