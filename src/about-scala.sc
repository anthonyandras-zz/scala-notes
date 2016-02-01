object FirstWorksheet {
  println("Welcome to the scala worksheet")
  4
  (4.5).toInt
  "4.5".toDouble
  null
  true
  () // unit
  // variables
  // scala does type inference
  val a = 5   // immutable
  val b = 15   // mutable
  val thisIsAVariable = 42
  val theAnswer = 45
  var c: Int = 5

  // tuples (scala supports this)
  (6,7)
  (3,4)
  (2.5, "a")
  (3,4,5,"hi")
  val (e,d) = ("hi", 2.5)
  // if expressions
  // expressions give us back a value
  if(a<9) println("less")
  val next = if(a % 2==0) a/2 else 3*a+1

  // match statements
  val result = (a*3,b) match {
    case (0,_) => "zero"
    case (i,0) => "one"
    //case 'b' => "Same as b"
    case i => "Something Bigger" + i // default
  }
}