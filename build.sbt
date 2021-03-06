lazy val scalaJsFormValidation = project.in(file(".")).enablePlugins(ScalaJSPlugin)

name := "scala-js-formvalidation"

description := "Scala.js FormValivation Facade"

version := "1.14"

organization := "ch.diadys"

organizationName := "Diadys Sarl"

organizationHomepage := Some(url("http://diadys.sarl"))

startYear := Some(2016)

licenses += "GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.html")

homepage := Some(url("https://github.com/diadys/scala-js-formvalidation"))

scalaVersion := "2.12.4"

scmInfo := Some(ScmInfo(
    url("https://github.com/diadys/scala-js-formvalidation.git"),
    "scm:git:git@github.com:diadys/scala-js-formvalidation.git",
    Some("scm:git:git@github.com:diadys/scala-js-formvalidation.git")))
    
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.9.2",
  "com.github.diadys" % "scala-js-bootstrap" % "1.8"
)

jsDependencies ++= Seq(
    ProvidedJS / "fv/fvbootstrap.js" minified "fv/fvbootstrap.min.js" dependsOn "fv/formValidation.js",
    ProvidedJS / "fv/formValidation.js" minified "fv/formValidation.min.js" dependsOn "bootstrap.js",
    ProvidedJS / "fv/fr.js" dependsOn "fv/fvbootstrap.js",
    ProvidedJS / "fv/mandatoryIcon.js" minified "fv/mandatoryIcon.min.js" dependsOn "fv/fvbootstrap.js"
)

pomExtra :=
  <developers>
    <developer>
      <id>diadys</id>
      <name>Didier Mounoud</name>
      <url>http://github.com/diadys/</url>
    </developer>
  </developers>
