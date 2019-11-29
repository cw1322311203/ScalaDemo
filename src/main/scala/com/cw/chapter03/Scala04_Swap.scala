package com.cw.chapter03


object Scala04_Swap {
  def main(args: Array[String]): Unit = {

    //交换
    var a = 10
    var b = 20

    //第一种

    var temp = a
    a = b
    b = temp

    println(s"a = ${a},b = ${b}")

    //第二种
    a = a + b
    b = a - b
    a = a - b

    println(s"a = ${a},b = ${b}")

    //第三种:异或运算,同为0 不同为1
    a = a ^ b
    b = a ^ b
    a = a ^ b

    println(s"a = ${a},b = ${b}")
  }
}
