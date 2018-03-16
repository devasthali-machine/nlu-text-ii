name := "alexas-mother"                                                                                                                           
                                                                                                       
version := "0.1"                                                                                       
                                                                                                       
scalaVersion := "2.12.4"                                                                               

libraryDependencies += "org.freemarker" % "freemarker" % "2.3.20"

mainClass in (Compile,run) := Some("alexasuncle.AlexasUncle")

