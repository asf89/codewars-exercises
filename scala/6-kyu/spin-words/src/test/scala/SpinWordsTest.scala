// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class SpinWordsTest extends munit.FunSuite {
  test("should return words with more than five letters reversed") {
    val argument = "Welcome"
    val obtained = spinWords(argument)
    val expected = "emocleW"
    assertEquals(obtained, expected)
  }
}
