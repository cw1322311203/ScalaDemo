package com.cw.chapter11

object Scala06_Match4 {
  def main(args: Array[String]): Unit = {

    // TODO 变量声明中的模式匹配
    // match中每一个case都可以单独提取出来，意思是一样的.
    val (x, y) = (1, 2)
    println(x + " = " + y)

    val (username, age, email) = ("zhangsan", 20, "133@163.com")
    println(username + " = " + age + " = " + email)


    val (q, r) = BigInt(10) /% 3 // 包含了2个连续的运算符,可以同时获取结果和余数
    println("q = " + q) // 结果
    println("r = " + r) // 余数

    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr
    println(first, second)


    // TODO for表达式中的模式匹配

    val list = List(("a", 1), ("b", 2), ("c", 3))

    for ((k, v) <- list) {
      println(k + " = " + v)
    }

    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) {
      println(k + " -> " + v)
    }

    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }

    for ((k, v) <- map if v == 0) {
      println(k + " ---> " + v)
    }


  }
}
