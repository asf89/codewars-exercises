@main def main: Unit = 
  val integers = List[Int](160, 3, 1719, 19, 11, 13, -21)
  println(findOutlier(integers))

def findOutlier(integers: List[Int]): Int =
  if integers.filter(_ % 2 == 0).length != 1 then
    integers.filter(_ % 2 != 0).head
  else
    integers.filter(_ % 2 == 0).head
