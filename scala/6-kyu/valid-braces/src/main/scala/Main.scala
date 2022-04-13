@main def main: Unit =
  val argument = "()[]{}"
  println(validBraces(argument))

def validBraces(str: String): Boolean =
  if str.contains("(]") then
    false
  else if str.contains("(}") then
    false
  else if str.contains("[)") then
    false
  else if str.contains("[}") then
    false
  else if str.contains("{)") then
    false
  else if str.contains("{]") then
    false
  else if str.length % 2 != 0 then
    false
  else if str.startsWith(")") then
    false
  else if str.startsWith("]") then
    false
  else if str.startsWith("}") then
    false
  else if str.endsWith("(") then
    false
  else if str.endsWith("[") then
    false
  else if str.endsWith("{") then
    false
  else
    true
