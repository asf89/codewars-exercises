// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class SimpleAssemblerInterpreterTest extends munit.FunSuite {
  test("given a list of program instructions, should return a dictionary with the contents of the registers") {
    val program = List("mov a 5","inc a","dec a","dec a","jnz a -1","inc a")
    val obtained = interpret(program)
    val expected = Map("a" -> 1)
    assertEquals(obtained, expected)
  }
}
