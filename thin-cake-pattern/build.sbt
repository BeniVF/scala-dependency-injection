
name := "Thin cake pattern"

version := "0.0.1"

scalaVersion := "2.11.2"

scalacOptions := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")


// Test dependencies
libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "org.mockito" % "mockito-core" % "1.9.5",
  "org.specs2" %% "specs2" % "2.3.13" % "test")

