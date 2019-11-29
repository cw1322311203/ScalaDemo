package com.cw.chapter03

import scala.io.StdIn

// 标准输入
object Scala03_In {
  def main(args: Array[String]): Unit = {
    val line: String = StdIn.readLine()
    println("line = " + line)
  }
}
