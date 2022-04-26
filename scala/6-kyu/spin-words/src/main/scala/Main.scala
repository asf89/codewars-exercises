@main def main: Unit = 
  val argument = "Welcome"
  println(spinWords(argument))

def spinWords(sentence: String): String = sentence.split(" ").map((s: String) => if s.length >= 5 then s.split("").reverse.mkString("") else s).toList.mkString(" ")
