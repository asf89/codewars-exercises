@main def main: Unit =
  val argument = 3
  println(pyramidArray(argument))

def pyramidArray(n: Int): List[List[Int]] = {
  def invertedPyramidArray(n: Int): List[List[Int]] = if n == 0 then Nil else List.fill(n)(1) :: invertedPyramidArray(n - 1)
  invertedPyramidArray(n).reverse
}
