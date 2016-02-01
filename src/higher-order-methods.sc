object HigherOrderFunctions {
  val a = Array(1,2,3,4,5)
  val b = List(5,8,7,3,1)
  val c = Vector.tabulate(10)(i => i * i)


  // very imperative
  a.foreach(println)
  a.foreach(i => println(i))

  // applys the function to each element in the sequence
  a.map(i => i * 2)
  a.map((i: Int) => i * 2)
  a.map(_*2)
  a.map(_+" is a number")

  // requires a predicate (a boolean function)
  a.filter(_ < 5)


  b.flatMap(i => b.take(i)) // research me

  c.exists(_ > 100)
  c.exists(_ > 50)
  c.forall(_ < 100)
  c.forall(_ < 50)


  // direction determines which order you run through collection
  a.reduceLeft((x, y) => x+y)
  a.reduceLeft(_ + _)


  a.foldLeft(0)(_+_)
  a.foldLeft("0")(_+_)
}