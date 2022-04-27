@main def main: Unit =
  val stocklist = Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
  val categories = Array("A", "B", "C", "D")
  println(stockSummary(stocklist, categories))

def stockSummary(stocklist: Array[String], categories: Array[String]): String = {
  var str = ""
  if stocklist.isEmpty || categories.isEmpty then
    str
  else
    for cat <- categories do
      var qnt = 0
      for stk <- stocklist do
        if stk.startsWith(cat) then
          qnt += stk.split(" ").last.toInt
      str = str ++ s"(${cat} : ${qnt}),"
    str.split(",").mkString(" - ")
}
