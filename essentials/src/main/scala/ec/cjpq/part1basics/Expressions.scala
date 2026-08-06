package ec.cjpq.part1basics

object Expressions {

  // expressions are structures that can be evaluated to a value
  val meaningOfLife = 40 + 2

  // mathematical expressions: +, -, *, /, bitwise, bitwise ~ (negation). ^ XOR, |, &, <<, >>, >>>
  val mathExpression = 2 + 3 * 4

  // comparison expressions: <, <=, >, >=, ==, !=
  val equalityTest = 1 == 2

  // boolean expression: !, ||, &&
  val nonEqualityTest = !equalityTest

  // instructions vs expressions
  // expressions are evaluated, instructions are executed
  // in scala, we think in terms of expressions

  // ifs are expressions
  val aCondition = true
  val anIfExpression = if (aCondition) 45 else 99

  // code blocks
  val aCodeBlock = {
    // local values
    val localValue = 78
    // expressions ...

    // last expression = value of the block
    localValue + 54
  }

  // everything in scala is an expression

  /**
   *  Excercise:
   *    Without running the code, what do you think these values print out?
   */
  // 1
  val someValue = {
    2 < 3
  }

  // 2
  val someOtherValue = {
    if (someValue) 239 else 986
    42

  }

  // 3
  // Unit has one possible value in Scala programming language, the () that is equals to void.
  val yetAnotherValue: Unit = println("Scala")
  val theUnit: Unit = ()

  def main(args: Array[String]): Unit = {
    println(meaningOfLife)

    println(anIfExpression)
    // just like the line above
    println(if (aCondition) 45 else 99)

    println(someValue) // true
    println(someOtherValue) // 42
    println(yetAnotherValue) // Scala, ()

  }
}
