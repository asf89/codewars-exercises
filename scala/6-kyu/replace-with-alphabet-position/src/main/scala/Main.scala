@main def main: Unit = 
  val text = "The sunset sets at twelve o' clock."
  println(alphabetPosition(text))

def alphabetPosition(text: String): String =
  text
    .toUpperCase
    .map(_ match {
      case 'A' => "1"
      case 'B' => "2"
      case 'C' => "3"
      case 'D' => "4"
      case 'E' => "5"
      case 'F' => "6"
      case 'G' => "7"
      case 'H' => "8"
      case 'I' => "9"
      case 'J' => "10"
      case 'K' => "11"
      case 'L' => "12"
      case 'M' => "13"
      case 'N' => "14"
      case 'O' => "15"
      case 'P' => "16"
      case 'Q' => "17"
      case 'R' => "18"
      case 'S' => "19"
      case 'T' => "20"
      case 'U' => "21"
      case 'V' => "22"
      case 'W' => "23"
      case 'X' => "24"
      case 'Y' => "25"
      case 'Z' => "26"
      case _ => ""
    })
    .filterNot(_ == "")
    .mkString(" ")
