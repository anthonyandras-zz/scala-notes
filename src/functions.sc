import scala.annotation.tailrec

object FunctionWorksheet {
  val a = 5

  // simple one liners can afford to not have an
  // explicitly return type here
  def square(x:Double) = x * x

  square(5)

  // procedure - doesn't return a value
  // return value is defined as "Unit"
  def greet(name:String):Unit = {
    println(s"Hello $name")
  }

  greet("Anthony")

  def factorial(n: Int):Int = if(n<2) 1 else n*factorial(n-1)
  factorial(5)
  def estimatePi(n:Int):Double = {
    def helper(n:Int):Double = {
      if(n < 1) 0 else {
        val x = math.random
        val y = math.random
        (if(square(x)+square(y)<1) 1 else 0) + helper(n-1)
      }
    }
    helper(n)/n*4
  }

  //estimatePi(10000) //causes stack overflow - solved by tail recursion
  // tail recursion - the last expression is only a function call.
  def estimatePiTail(n:Int):Double = {
    @tailrec
    def helper(n: Int, sum: Int): Double = {
      if(n<1) sum else {
        val x = math.random
        val y = math.random
        helper(n-1, sum+(if(square(x)+square(y)<1) 1 else 0)) // no addition
      }
    }
    helper(n,0)/n*4
  }

  estimatePiTail(10000)
}