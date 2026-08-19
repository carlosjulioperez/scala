package ec.cjpq.part1basics

object Functions {

  // function = reusable piece of code that you can invoke with some arguments and return a result
  def aFunction (a: String, b:Int): String =
    a + " " + b

  // function invocation
  val aFunctionInvocation = aFunction("Scala", 99999)

  def noArgFunction(): Int = 45
  def aParameterlessFunction: Int = 45

  // functions can be recursive
  def stringConcatenation(str: String, n:Int): String =
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)

  /*
    sc("Scala", 3) = "Scala"
   */
  val scala3 = stringConcatenation("Scala", 3)

  def main(args: Array[String]): Unit = {
    println(scala3)
  }

}
