//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

object problem1 {
  def main(args:Array[String]) { 
    println("answer: " + sum(1000,3,5,3,5,0L)) 
  } 
  def sum(limit:Int,m1:Int,m2:Int,a:Int,b:Int,accum:Long): Long = (a,b) match {
    case (x:Int,y:Int) if (x >= limit && y >= limit) => accum
    case (x:Int,y:Int) if x < y => sum(limit,m1,m2,x+m1,y,accum+x)
    case (x:Int,y:Int) if x > y => sum(limit,m1,m2,x,y+m2,accum+y)
    case _ => sum(limit,m1,m2,a+m1,b+m2,accum+a)
  }
}
