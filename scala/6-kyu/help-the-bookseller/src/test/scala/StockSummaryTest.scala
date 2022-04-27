// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class StockSummaryTest extends munit.FunSuite {
  test("should return a string with the book code and the number its books") {
    val stocklist = Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
    val categories = Array("A", "B", "C", "D")
    val obtained = stockSummary(stocklist, categories)
    val expected = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
    assertEquals(obtained, expected)
  }
}
