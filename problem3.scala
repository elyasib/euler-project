//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

import math._

object problem3 {
  def largestFactor(num: BigInt): BigInt = {
    var pfc: Int = 2 //Prime factor candidate
    val limit: Int = ceil(sqrt(num.longValue())).toInt
    var largestPF: Long = 2
    var isPrime: Boolean = false
    
    while (pfc <= limit && !isPrime) {
      if (num % pfc == 0) // is num divisible by pfc? 
        if (BigInt(2).pow(pfc).-(2) % pfc == 0) //is pfc a composite number? 
          isPrime = (2 until ceil(sqrt(pfc)).toInt) forall (pfc % _ != 0) //is pfc a prime number 
      pfc += 1
    }
    if (isPrime) largestFactor(num / (pfc - 1)) else num * 1
  }
  def main(args: Array[String]) {
    println(largestFactor(BigInt(600851475143L)).toString)
  }
}

