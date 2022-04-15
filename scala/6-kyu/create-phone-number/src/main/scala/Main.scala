@main def main: Unit =
  val argument = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
  println(createPhoneNumber(argument))

def createPhoneNumber(seq: Seq[Int]): String = s"(${seq.take(3).mkString}) ${seq.drop(3).take(3).mkString}-${seq.drop(6).mkString}"
