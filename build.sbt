name := """play-demo-app"""
organization := "com.hashedin"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.10"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test

libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.1.0"
libraryDependencies += "org.postgresql" % "postgresql" % "42.5.4"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.hashedin.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.hashedin.binders._"
