package ec.cjpq.part1basics

object Functions {

  // function = reusable piece of code that you can invoke with some arguments and return a result
  def aFunction (a: String, b:Int): String =
    a + " " + b

  // function invocation
  val aFunctionInvocation = aFunction("Scala", 99999)

  def main(args: Array[String]): Unit = {

  }

}
