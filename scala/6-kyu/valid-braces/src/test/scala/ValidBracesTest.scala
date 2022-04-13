// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class ValidBracesTest extends munit.FunSuite {
  test("should return true if string of braces is valid") {
    val argument = "()[]{}"
    val obtained = validBraces(argument)
    val expected = true
    assertEquals(obtained, expected)
  }

  test("should return false if string of braces is invalid") {
    val argument = "[({})](]"
    val obtained = validBraces(argument)
    val expected = false
    assertEquals(obtained, expected)
  }
}
