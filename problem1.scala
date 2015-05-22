//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

object problem1 {
  def main(args: Array[String]) { 
    val numA: Int = 3 
	val numB: Int = 5 
	val limit: Int = 1000 
	var currMultA: Int = numA 
	var currMultB: Int = numB 
	var accum: Long = 0 
	while (currMultA < limit || currMultB < limit) { 
      if (currMultA < currMultB) { 
        accum += currMultA 
        currMultA += numA 
      } 
      else if (currMultA > currMultB) { 
        accum += currMultB 
        currMultB += numB 
      } 
      else { 
        accum += currMultA 
        currMultA += numA 
        currMultB += numB 
      } 
    } 
    println("accum: " + accum) 
  } 
}
