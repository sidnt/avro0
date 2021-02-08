val scala3V = "3.0.0-M3"
val zioV = "1.0.4-2"
val avroV = "1.10.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "avro0",
    version := "0.1.0",
    scalaVersion := scala3V,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioV,
      "org.apache.avro" % "avro" % avroV
    )
  )
