package com.cw.chapter05

object Scala09_Exception {
  def main(args: Array[String]): Unit = {
    //  TODO 异常
    // 1) 在Scala里，借用了模式匹配的思想来做异常的匹配，因此，在catch的代码里，是一系列case子句来匹配异常。
    // 2) 如果有异常发生，catch子句是按次序捕捉的
    // 3) 因此，在catch子句中，越具体的异常越要靠前，如果把越普遍的异常写在前，在scala中也不会报错，但这样是非常不好的编程风格。


    try {
      val i = 10
      val j = 0
      val z = i / j
    } catch {
      case ex: ArithmeticException => println("捕获了除数为零的算术异常")
      case ex: Exception => println("捕获了异常")
    } finally {
      // 最终要执行的代码
      println("finally...")
    }
  }
}
