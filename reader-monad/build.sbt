
name := "Reader Monad"

version := "0.0.1"

scalaVersion := "2.10.3"

scalacOptions := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")


// Test dependencies
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.6",
  "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test",
  "org.mockito" % "mockito-core" % "1.9.5",
  "org.specs2" %% "specs2" % "2.3.10" % "test")
