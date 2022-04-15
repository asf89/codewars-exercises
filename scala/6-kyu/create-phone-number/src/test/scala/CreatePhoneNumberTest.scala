// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class CreatePhoneNumberTest extends munit.FunSuite {
  test("should return a phone number in a string format") {
    val argument = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val obtained = createPhoneNumber(argument)
    val expected = "(123) 456-7890"
    assertEquals(obtained, expected)
  }
}
