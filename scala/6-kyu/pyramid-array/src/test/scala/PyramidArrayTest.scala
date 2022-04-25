// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class PyramidArrayTest extends munit.FunSuite {
  test("should return an array of ascending length subarrays filled with 1s if n >= 0") {
    val argument = 3
    val obtained = pyramidArray(argument)
    val expected = List[List[Int]](List(1), List(1, 1), List(1, 1, 1))
    assertEquals(obtained, expected)
  }
}
