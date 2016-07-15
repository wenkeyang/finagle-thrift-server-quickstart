name := "finagle-thrift-server-quickstart"

version := "0.1.0"

scalaVersion := "2.11.8"

com.twitter.scrooge.ScroogeSBT.newSettings

resolvers ++= Seq(
  "twttr" at "http://maven.twttr.com/"
)

val finagleVersion = "6.36.0"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-core" % finagleVersion,
  "com.twitter" %% "finagle-thrift" % finagleVersion,
  "com.twitter" %% "finagle-thriftmux" % finagleVersion,
  "com.twitter" %% "scrooge-core" % "4.8.0",
  "org.apache.thrift" % "libthrift" % "0.9.3",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
