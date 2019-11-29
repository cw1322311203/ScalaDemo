package com.cw.chapter05

object Scala08_Lazy {

  def main(args: Array[String]): Unit = {

    //  TODO 惰性lazy
    // 1) 当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。这种函数我们称之为惰性函数
    // 在Java的某些框架代码中称之为懒加载(延迟加载)。
    // 2) lazy 不能修饰 var 类型的变量
    // 3) 不但是在调用函数时,加了lazy,会导致函数的执行被推迟，我们在声明一个变量时，如果给声明了lazy,那么变量值得分配也会推迟。比如lazy val i = 10

    //lazy val res = sum(10, 20)
    val res = sum(10, 20)
    println("-----------------")
    println("-----------------")
    println("-----------------")
    println("-----------------")
    println("res=" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum() 执行了..")
    return n1 + n2
  }
}
