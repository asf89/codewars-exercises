// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class StringToCamelCaseTest extends munit.FunSuite {
  test("should return a camel case string from a dashed word") {
    val argument = "the-stealth-warrior"
    val obtained = stringToCamel(argument)
    val expected = "theStealthWarrior"
    assertEquals(obtained, expected)
  }

  test("should return a upper camel case string from a dashed word when the original word is already capitalized") {
    val argument = "The-Stealth-Warrior"
    val obtained = stringToCamel(argument)
    val expected = "TheStealthWarrior"
    assertEquals(obtained, expected)
  }

  test("should return a camel case string from an underscored word") {
    val argument = "the_stealth_warrior"
    val obtained = stringToCamel(argument)
    val expected = "theStealthWarrior"
    assertEquals(obtained, expected)
  }

  test("should return a upper camel case string from an underscored word when the original word is already capitalized") {
    val argument = "The_Stealth_Warrior"
    val obtained = stringToCamel(argument)
    val expected = "TheStealthWarrior"
    assertEquals(obtained, expected)
  }
}
