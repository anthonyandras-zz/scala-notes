

// sequences - array, list, vector, buffer, range

object Collections {
  val arr = Array(1, 2, 3)
  val lst = List(7,4,5,6,7)

  arr(0)
  lst(2)

  // arrays by default are mutable
  arr(0) = 5
  arr

  // lists are immutable by default
  // lists are singly linked list
  // appending is expensive.
  //lst(0) = 99


  val lst2 = 1::lst // add to front of list (cons)
  lst2

  //Vector(1,2,3)


  /**
   * Note that the following applies to both
   * arrays and lists.
   */

  // currying
  // works with lists as well
  val arr2 = Array.fill(10)(math.random)

  // pass by name
  def littleArray(i: => Int):Array[Int] = Array(i,i,i)

  // instead of evaluating util.Random.nextInt,
  // it will pass in the function util.Random.nextInt
  // and lazily evaluate it when assignment happens
  littleArray(util.Random.nextInt(10))

  // lambda
  var arr3 = Array.tabulate(10)(i => i * i)

  /**
   * End array / list example
   */


  // indexable sequence that is immutable
  // multiway tree
  Vector(1, 2, 3)

  //import collection.mutable._ // bad
  import collection.mutable
  mutable.Buffer(1,2,3)
  mutable.ListBuffer(1,2,3)

  1 to 10 // range - sequence of values
  1 to 10 by 2 // range with step
  0.0 to 1.0 by 0.1
  10 to 1 by -1

  /**
   * General collection methods
   */

  arr ++ arr2 // append the two sequences
  // when an operator ends in a : it is right-associative
  arr ++: arr2 // this method is being called on arr2 instead of arr


  // no args implies no parens required
  arr.size
  arr.length

  arr.head
  arr.last
  arr.tail

  arr2.drop(3)
  arr2.take(3)
  arr2.reverse

  val (before, after) = arr2.splitAt(4)
  arr2.slice(3, 6)

  arr.isEmpty
  arr.nonEmpty
  arr.startsWith(Array(1,2))

  arr2.indices
  arr2.max
  arr2.min
  arr2.sum
  arr.product

  lst.toArray
  lst.toVector
  lst.par // not a good idea on a list

  lst.updated(1, 99)

  arr2.patch(2,Array(1,2,3), 0)

  /**
   * More unique scala collection methods
   */

  val arr4 = Array(1,3,5,7,9)
  arr4.intersect(arr)
  arr4.union(arr).distinct
  arr4.diff(arr) // nice!
  arr4.mkString(", ") //takes values and converts them to strings
  arr4.mkString("(", ",", ")")
  arr4.view
  arr4.zip(arr) // generates the cart product

  arr4.zipWithIndex
}