package com.cw

object Test {
  def main(args: Array[String]): Unit = {
    var result = if (3 > 1) true else false
    println(result)
    println(1.to(5))
    for (i <- 1.to(5)) {
      println(i)
    }

    for (i <- 1 to 5){
      println(i)
    }
  }
}
