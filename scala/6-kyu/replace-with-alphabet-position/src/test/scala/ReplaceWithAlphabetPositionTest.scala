// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class ReplaceWithAlphabetPositionTest extends munit.FunSuite {
  test("given a string, should replace every letter with its position in the alphabet") {
    val argument = "The sunset sets at twelve o' clock."
    val obtained = alphabetPosition(argument)
    val expected = "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
    assertEquals(obtained, expected)
  }
}
