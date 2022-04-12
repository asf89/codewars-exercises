@main def main: Unit =
  val argument = "the-stealth-warrior"
  val output = stringToCamel(argument)
  println(output)

def stringToCamel(arg: String): String =
  if arg.contains("-") then
    arg.split("-")(0) ++ arg.split("-").slice(1, arg.split("-").length).map(str => str.capitalize).mkString
  else if arg.contains("_") then
    arg.split("_")(0) ++ arg.split("_").slice(1, arg.split("_").length).map(str => str.capitalize).mkString
  else ""
