lazy val root = (project in file(".")).enablePlugins().
  settings(
    name := "marathon-ui-example-plugin",
    organization := "mesosphere.marathon",
    version := "1.0",
    scalaVersion := "2.11.5"
  )

resolvers += Resolver.sonatypeRepo("releases")
resolvers += "Mesosphere Public Repo" at "http://downloads.mesosphere.io/maven"

libraryDependencies ++= Seq(
  "mesosphere.marathon" %% "plugin-interface" % "0.16.0-SNAPSHOT" % "provided",
  "ch.qos.logback" % "logback-classic" % "1.1.3" % "provided"
)

lazy val buildUi = TaskKey[Unit]("build-ui", "Build the UI by exec `npm run build`")

buildUi := {
  "npm run build" !
}

packAutoSettings
packExcludeJars := Seq("scala-.*\\.jar")
