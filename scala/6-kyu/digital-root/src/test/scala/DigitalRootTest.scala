// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class DigitalRootTest extends munit.FunSuite {
  test("should return the recursive sum of all digits in a number") {
    val argument = 456
    val obtained = digitalRoot(argument)
    val expected = 6
    assertEquals(obtained, expected)
  }
}
