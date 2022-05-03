@main def main: Unit =
  val program = List("mov a -10","mov b a","inc a","dec b","jnz a -2")
  println(interpret(program))

def interpret(program: List[String]): Map[String, Int] = {
  var result = Map.empty[String, Int]
  var i = 0
  while i < program.length do

    if program(i).split(" ").head == "mov" && program(i).split(" ").tail.last.matches("[a-z]+") then
      result += (program(i).split(" ").tail.head, result(program(i).split(" ").tail.last))
    else if program(i).split(" ").head == "mov" && program(i).split(" ").tail.last.matches("\\-?[0-9]+") then
      result += (program(i).split(" ").tail.head, program(i).split(" ").tail.last.toInt)
    else if program(i).split(" ").head == "inc" then
      result = result.updated(program(i).split(" ").last, result(program(i).split(" ").last) + 1)
    else if program(i).split(" ").head == "dec" then
      result = result.updated(program(i).split(" ").last, result(program(i).split(" ").last) - 1)
    else if program(i).split(" ").head == "jnz" then
      if program(i).split(" ").tail.head.matches("[a-z]+") then
        if result(program(i).split(" ").tail.head) != 0 && program(i).split(" ").tail.last.toInt < 0 then
          i += program(i).split(" ").tail.last.toInt - 1
        else if result(program(i).split(" ").tail.head) != 0 && program(i).split(" ").tail.last.toInt == 0 then
          i += 0
        else if result(program(i).split(" ").tail.head) != 0 && program(i).split(" ").tail.last.toInt > 0 then
          i += program(i).split(" ").tail.last.toInt - 1
        else
          i += 0
      else
        i += program(i).split(" ").tail.last.toInt - 1
    else
      i += 0

    i += 1

  return result
}
