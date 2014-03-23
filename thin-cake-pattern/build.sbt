
name := "Thin cake pattern"

version := "0.0.1"

scalaVersion := "2.10.3"

scalacOptions := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")


// Test dependencies
libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.0.1" % "test")
