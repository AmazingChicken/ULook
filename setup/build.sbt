name := """ULook"""
organization := "UNSW"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

libraryDependencies += jdbc

libraryDependencies ++= Seq(
  jdbc,
  "org.postgresql" % "postgresql" % "42.1.3.jre7",
  cache,
  javaWs
)
