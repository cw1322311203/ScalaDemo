package com.cw.chapter04

object Scala02_Exp {
  def main(args: Array[String]): Unit = {

    // TODO Scala中所有的表达式都有值,也就意味着if else表达式其实是有返回结果的
    //  具体返回结果的值取决于满足条件的代码体的最后一行内容

    val flg = false

    //true:Unit    false:String
    val value: Any = if (flg) {
      "abc"
      println("abc")
    } else {
      "bcd"
    }

    println(value)

    // TODO 使用if else来模拟三元运算符
    val s = if (flg) "a" else "b"
    println(s)

    val result: AnyVal = if (flg) {
      1
    }
  }
}
