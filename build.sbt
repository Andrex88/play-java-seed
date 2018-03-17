name := """play-java-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"
libraryDependencies += filters
libraryDependencies += guice
libraryDependencies += "org.webjars" % "primeui" % "1.0"