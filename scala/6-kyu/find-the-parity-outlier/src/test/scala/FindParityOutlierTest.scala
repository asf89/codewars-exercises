// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class FindParityOutlierTest extends munit.FunSuite {
  test("should return the only odd number in the list") {
    val integers = List[Int](2, 4, 0, 100, 4, 11, 2602, 36)
    val obtained = findOutlier(integers)
    val expected = 11
    assertEquals(obtained, expected)
  }

  test("should return the only even number in the list") {
    val integers = List[Int](160, 3, 1719, 19, 11, 13, -21)
    val obtained = findOutlier(integers)
    val expected = 160
    assertEquals(obtained, expected)
  }
}
