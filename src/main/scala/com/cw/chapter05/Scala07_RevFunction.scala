package com.cw.chapter05

object Scala07_RevFunction {
  def main(args: Array[String]): Unit = {

    // 反转简化后的函数

    /*
    def f1 = "rev"

    def f2(): String = {
      "rev"
    }
    */
    // println(f1)


    // TODO function类型最大为22
    val f0 = () => {}
    val f1 = (x: Int) => {}
    val f2 = (x: Int, y: Int) => {}
    // f0属于function类型,后面的数字表示参数个数,最大为22
    println(f0) // <function0>
    println(f1) // <function1>
    println(f2) // <function2>

    // TODO 高阶函数:将其他函数作为参数或者返回值为一个函数的函数
    // 函数的第一个参数类型是另一个函数
    def appply(f: Int => String, v: Int) = f(v)

    def fmtInt(n: Int): String = "[整数值{" + n + "}]"

    println(appply(fmtInt, 1200))

    // 函数的返回值是一个函数
    def addBy(n: Int) = {
      (d: Double) => n + d
    }

    println(addBy(50)(80.223))


    def test1(x: Double) = {
      (y: Double) => x * x * y // 返回匿名函数
    }

    val res = test1(2.0)(3.0)
    println("res=" + res) // 12.0

    def minusxy(x: Int) = {
      (y: Int) => x - y // 返回匿名函数
    }

    val result3 = minusxy(3)(5)
    println(result3) // -2

  }
}
