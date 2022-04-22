@main def main: Unit =
  val argument = 16
  println(digitalRoot(argument))

def digitalRoot(n: Int): Int =
  def remainderSum(n: Int): Int = if n / 10 == 0 then n else (n % 10) + remainderSum(n / 10)
  val number = remainderSum(n)
  if number / 10 == 0 then number else digitalRoot(number)
